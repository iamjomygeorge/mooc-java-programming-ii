import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String texts : hashmap.keySet()) {
            if (texts.contains(text)) {
                System.out.println(texts);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String value : hashmap.keySet()) {
            if (value.contains(text)) {
                System.out.println(hashmap.get(value));
            }
        }
    }
}
