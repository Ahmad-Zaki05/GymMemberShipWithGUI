import java.util.ArrayList;

public class TrainerDatabase {

    private ArrayList<Trainer> records;
    private final String fileName;

    public TrainerDatabase() {
        this.fileName = "Trainers.txt";
        records = new ArrayList<Trainer>();
    }

    public Trainer createRecordFrom (String line) {
        String[] parts = line.split(",");
        return new Trainer(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }

    public ArrayList<Trainer> returnAllRecords() {
        return records;
    }

    public boolean contains (String key) {
        for (Trainer record : records) {
            if (record.getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public Trainer getRecord(String key) {
        for (Trainer record : records) {
            if (record.getSearchKey().equals(key)) {
                return record;
            }
        }
        return null;
    }

    public void insertRecord(Trainer record) {
        if(!contains(record.getSearchKey())) {
            records.add(record);
        }
        else {
            System.out.println("Trainer already exists");
        }
    }
    public void deleteRecord(String key) {
        Trainer record = getRecord(key);
        if (record != null) {
            records.remove(record);
        }
    }
    public void readFromFile() {
        // read from file
    }
    public void saveToFile() {
        // write to file
    }

}
