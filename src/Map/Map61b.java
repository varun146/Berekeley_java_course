package Map;

import java.util.List;

public interface Map61b<K, V> {

    boolean containsKey(K key); // Returns true if this map contains a mapping for the specified key
    int size(); // returns the size
    void put(K key, V Value); // Associates the specified value with the specified key in the map
    V get(K key); // Returns the value associated with the specified key
    List<K> keys(); //  Returns a list of the keys

}
