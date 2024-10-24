public class Trainer {
    private String trainerId;
    private String name;
    private String email;
    private String specialty;
    private String phoneNumber;

    public Trainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.specialty = specialty;
        this.phoneNumber = phoneNumber;
    }

    public String lineRepresentation(){
        return String.join(",",trainerId, name, email, specialty, phoneNumber);
    }

    public String getSearchKey(){
        return trainerId;
    }
}

class Member {
    private String memberId;
    private String name;
    private String membershipType;
    private String email;
    private String phoneNumber;
    private String status;

    public Member(String memberId, String name, String membershipType, String email, String phoneNumber, String status) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }
    public String lineRepresentation(){
        return String.join(",",memberId, name,membershipType, email, phoneNumber,status);
    }

    public String getSearchKey(){
        return memberId;
    }
}
