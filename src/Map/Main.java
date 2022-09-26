package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


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
