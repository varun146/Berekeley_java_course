package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        ArrayMap<String, Integer> map = new ArrayMap<>();
//
//        map.put("Varun", 78);
//        map.put("Chandan", 45);
//        map.put("Paridhi", 90);
//        map.put("Dad", 67);
//        map.put("Chandan", 0000);
//        System.out.println(map.keys());
//        System.out.println(map.get("Varun"));

        Hashtable<String, Integer> ht = new Hashtable<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("Varun", 89);
        map.put(null, 56);

        ht.put("Chandan", 99);
        ht.put("Tiger", 00);
//        ht.put(null, 12);
        System.out.println(map);
        System.out.println(ht);
    }
}
