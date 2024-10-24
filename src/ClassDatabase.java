import java.util.ArrayList;

public class ClassDatabase {

    private ArrayList<Class> records;
    private final String fileName;

    public ClassDatabase() {
        this.fileName = "Classes.txt";
        records = new ArrayList<Class>();
    }

    public Class createRecordFrom (String line) {
        String[] parts = line.split(",");
        return new Class(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]));
    }

    public ArrayList<Class> returnAllRecords() {
        return records;
    }

    public boolean contains (String key) {
        for (Class record : records) {
            if (record.getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public Class getRecord(String key) {
        for (Class record : records) {
            if (record.getSearchKey().equals(key)) {
                return record;
            }
        }
        return null;
    }

    public void insertRecord(Class record) {
        if(!contains(record.getSearchKey())) {
            records.add(record);
        }
        else {
            System.out.println("Class already exists");
        }
    }

    public void deleteRecord(String key) {
        Class record = getRecord(key);
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
