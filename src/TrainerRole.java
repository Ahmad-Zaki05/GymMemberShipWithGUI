//this is essentially the GUI we will use
//for members add setRegistrationStatus and getRegistrationDate

import java.time.LocalDate;

public class TrainerRole {

    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;


    public TrainerRole() {
        memberDatabase = new MemberDatabase();
        classDatabase = new ClassDatabase();
        registrationDatabase = new MemberClassRegistrationDatabase();
        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }

    public void addMember(String memberId, String name, String membershipType, String email, String phoneNumber, String status) {
        Member member = new Member(memberId, name, membershipType, email, phoneNumber, status);
        memberDatabase.insertRecord(member);
    }

    public MemberDatabase getListOfMembers() {
        return memberDatabase;
    }

    public void addClass(String classID, String className, String trainerId, int duration, int maxParticipants) {
        Class newClass = new Class(classID, className, trainerId, duration, maxParticipants);
        classDatabase.insertRecord(newClass);
    }

    public ClassDatabase getListOfClasses() {
        return classDatabase;
    }

    public void registerMemberForClass(String memberId, String classId, LocalDate registrationDate) {
        MemberClassRegistration registration = new MemberClassRegistration(memberId, classId,"Active", registrationDate);
        registrationDatabase.insertRecord(registration);
        classDatabase.getRecord(classId).setAvailableSeats(classDatabase.getRecord(classId).getAvailableSeats() - 1);
    }

    public void cancelRegistration(String memberId, String classId) {
        MemberClassRegistration registration = registrationDatabase.getRecord(memberId + classId);
        if(registration == null) {
            System.out.println("Registration does not exist");
            return;
        }
        if (registration.getRegistrationDate().isAfter(registration.getRegistrationDate().plusDays(3))) {
            System.out.println("Cannot cancel registration");
            return;
        }
        registration.setRegistrationStatus("Cancelled");
        registrationDatabase.insertRecord(registration);
        classDatabase.getRecord(classId).setAvailableSeats(classDatabase.getRecord(classId).getAvailableSeats() + 1);
    }

    public void getListOfRegistrations() {
        registrationDatabase.returnAllRecords();
    }

    public void logout() {
        System.out.println("Logging out");
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }

}
