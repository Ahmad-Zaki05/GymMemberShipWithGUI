import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
        try {
            File file = new File (fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                insertRecord(createRecordFrom(fileScanner.nextLine()));;
            }
            fileScanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void saveToFile() {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (int i = 0; i < records.size(); i ++) {
                fileWriter.write(records.get(i).lineRepresentation() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
