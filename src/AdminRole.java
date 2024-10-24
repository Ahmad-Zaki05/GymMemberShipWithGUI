public class AdminRole {
    private TrainerDatabase database;

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer trainer = new Trainer(trainerId, name, email, specialty, phoneNumber);


    }

    public TrainerDatabase getListOfTrainers() {
        return database;
    }

    public void removeTrainer(String trainerId) {

        database.deleteRecord(trainerId);

    }


}
