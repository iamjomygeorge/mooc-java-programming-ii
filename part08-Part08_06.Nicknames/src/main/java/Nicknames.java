import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("matthew", "matt");
        hashMap.put("michael", "mix");
        hashMap.put("arthur", "artie");

        System.out.println((hashMap.get("matthew")));
    }

}
