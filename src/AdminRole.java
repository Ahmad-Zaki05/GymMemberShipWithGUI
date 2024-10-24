public class AdminRole {
    private TrainerDatabase database;

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer trainer = new Trainer(trainerId, name, email, specialty, phoneNumber);
        database.insertRecord(trainer);
    }

    public TrainerDatabase getListOfTrainers() {
        return database;
    }

    public void removeTrainer(String trainerId) {

        database.deleteRecord(trainerId);

    }

    public void logout(){
        database.saveToFile();
    }

}
