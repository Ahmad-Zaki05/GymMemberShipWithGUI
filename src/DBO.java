public interface DBO {

    default void readFromFile(){

    }
    public  static boolean contains(String key){
        return false;
    }
    public default void deleteRecord(String key){

    }
    public default void saveToFile(){

    }
}
