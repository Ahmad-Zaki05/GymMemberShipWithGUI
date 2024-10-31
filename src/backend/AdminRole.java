package backend;//this is essentially the GUI we will use

import java.util.ArrayList;

public class AdminRole {
    private final TrainerDatabase database;

    public AdminRole() {
        database = new TrainerDatabase("Trainers.txt");
    }

    //adds a trainer to the database
    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer trainer = new Trainer(trainerId, name, email, specialty, phoneNumber);
        database.insertRecord(trainer);
    }

    //retrieves the list of trainers
    public ArrayList<Record> getListOfTrainers() {
        return database.returnAllRecords();
    }

    //removes a trainer from the database
    public void removeTrainer(String trainerId) {
        database.deleteRecord(trainerId);
    }

    //save the database to a file on logout
    public void logout(){
        database.saveToFile();
    }

}
