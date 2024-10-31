package backend;

import java.time.LocalDate;

public class MemberClassRegistration implements Record{

    private String memberId;
    private String classId;
    private String status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberId, String classId, String status, LocalDate registrationDate) {
        this.memberId = memberId;
        this.classId = classId;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getClassId() {
        return classId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationStatus(String status){
        this.status = status;
    }

    public String getSearchKey() {
        return memberId + classId;
    }

    public String lineRepresentation(){
        return String.join(",",memberId, classId,status,registrationDate.toString());
    }

}
