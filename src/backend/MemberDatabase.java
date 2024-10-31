package backend;

public class MemberDatabase extends DBO {

    // private ArrayList<backend.Member> records;
    // private final String fileName;

    public MemberDatabase(String fileName) {
        super(fileName);
    }

    public Record createRecordFrom (String line) {
        String[] parts = line.split(",");
        return new Member(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
    }

    // public ArrayList<backend.Member> returnAllRecords() {
    //     return records;
    // }

    // public boolean contains (String key) {
    //     for (backend.Member record : records) {
    //         if (record.getSearchKey().equals(key)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public backend.Record getRecord(String key) {
    //     for (backend.Record record : records) {
    //         if (record.getSearchKey().equals(key)) {
    //             return record;
    //         }
    //     }
    //     return null;
    // }

    // public void insertRecord(backend.Member record) {
    //     if(!contains(record.getSearchKey())) {
    //         records.add(record);
    //     }
    //     else {
    //         System.out.println("backend.Member already exists");
    //     }
    // }

    // public void deleteRecord(String key) {
    //     backend.Member record = (backend.Member) getRecord(key);
    //     if (record != null) {
    //         records.remove(record);
    //     }
    // }

    // public void readFromFile() {
    //     try {
    //         File file = new File (fileName);
    //         Scanner fileScanner = new Scanner(file);
    //         while (fileScanner.hasNextLine()) {
    //             insertRecord(createRecordFrom(fileScanner.nextLine()));;
    //         }
    //         fileScanner.close();
    //     }
    //     catch (FileNotFoundException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    // }

    // public void saveToFile() {
    //     try {
    //         FileWriter fileWriter = new FileWriter(fileName);
    //         for (int i = 0; i < records.size(); i ++) {
    //             fileWriter.write(records.get(i).lineRepresentation() + "\n");
    //         }
    //         fileWriter.close();
    //     } catch (IOException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    // }
}
