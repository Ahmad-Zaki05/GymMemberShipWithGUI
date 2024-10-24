import java.util.ArrayList;

public class MemberDatabase {

    private ArrayList<Member> records;
    private final String fileName;

    public MemberDatabase() {
        this.fileName = "Members.txt";
        records = new ArrayList<Member>();
    }

    public Member createRecordFrom (String line) {
        String[] parts = line.split(",");
        return new Member(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
    }

    public ArrayList<Member> returnAllRecords() {
        return records;
    }

    public boolean contains (String key) {
        for (Member record : records) {
            if (record.getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public Member getRecord(String key) {
        for (Member record : records) {
            if (record.getSearchKey().equals(key)) {
                return record;
            }
        }
        return null;
    }

    public void insertRecord(Member record) {
        if(!contains(record.getSearchKey())) {
            records.add(record);
        }
        else {
            System.out.println("Member already exists");
        }
    }

    public void deleteRecord(String key) {
        Member record = getRecord(key);
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
