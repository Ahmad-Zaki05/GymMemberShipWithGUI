package backend;
import constants.FileNames;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainerRole {

    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;


    public TrainerRole() {
        memberDatabase = new MemberDatabase(FileNames.MEMBER_FILENAME);
        classDatabase = new ClassDatabase(FileNames.CLASS_FILENAME);
        registrationDatabase = new MemberClassRegistrationDatabase(FileNames.REGISTRATION_FILENAME);
    }

    public void addMember(String memberId, String name, String membershipType, String email, String phoneNumber, String status) {
        Member member = new Member(memberId, name, membershipType, email, phoneNumber, status);
        memberDatabase.insertRecord(member);
    }

    public ArrayList<Record> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    public void addClass(String classID, String className, String trainerId, int duration, int maxParticipants) {
        Class newClass = new Class(classID, className, trainerId, duration, maxParticipants);
        classDatabase.insertRecord(newClass);
    }

    public ArrayList<Class> getListOfClasses() {
        ArrayList ClassList = new ArrayList<Class>();
        for (Record record : classDatabase.returnAllRecords()) {
            ClassList.add((Class) record);
        }
        return ClassList;
    }

    public boolean registerMemberForClass(String memberId, String classId, LocalDate registrationDate) {
        if(!memberDatabase.contains(memberId)) {
               return false;
        }
        if(!classDatabase.contains(classId)) {
            return false;
        }
        if(((Class) classDatabase.getRecord(classId)).getAvailableSeats() == 0) {
               return false;
        }

        if(registrationDatabase.contains(memberId + classId)) {
            return false;
        }

        MemberClassRegistration registration = new MemberClassRegistration(memberId, classId,"Active", registrationDate);
        registrationDatabase.insertRecord(registration);
        Class class1 = (Class) classDatabase.getRecord(classId);
        class1.setAvailableSeats( class1.getAvailableSeats() - 1);
        return true;
    }

    public boolean cancelRegistration(String memberId, String classId) {
        if(!memberDatabase.contains(memberId)) {
                      return false;
        }
        if(!classDatabase.contains(classId)) {
                    return false;
        }
        MemberClassRegistration registration =  (MemberClassRegistration) registrationDatabase.getRecord(memberId + classId);
        if(registration == null) {
                   return false;
        }
        LocalDate allowedCancellationDate = registration.getRegistrationDate().plusDays(3);
        if (LocalDate.now().isAfter(allowedCancellationDate)) {
            return false;
        }
        ((MemberClassRegistration) registrationDatabase.getRecord(memberId + classId)).setRegistrationStatus("Canceled");
        Class class1 = (Class) classDatabase.getRecord(classId);
        class1.setAvailableSeats( class1.getAvailableSeats() + 1);
        return true;
    }

    public ArrayList<Record> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }

}
