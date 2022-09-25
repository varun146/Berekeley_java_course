package Map;

public class Main {

    public static void main(String[] args) {

        ArrayMap<String, Integer> map = new ArrayMap<>();

        map.put("Varun", 78);
        map.put("Chandan", 45);
        map.put("Paridhi", 90);
        map.put("Dad", 67);
        map.put("Chandan", 0000);
        System.out.println(map.keys());
        System.out.println(map.get("Varun"));
    }
}
