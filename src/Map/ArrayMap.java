package Map;

import java.util.ArrayList;
import java.util.List;

public class ArrayMap<K, V> implements Map61b<K, V>{

    private K[] keys;
    private V[] values;
    int size;
    public ArrayMap(){
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    private int keyIndex(K key){
        for (int i = 0; i < size; i++) {
            if(key.equals(keys[i])){
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean containsKey(K key) {
        int index = keyIndex(key);
        return index > -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(K key, V Value) {
        int index  = keyIndex(key);
        if(index == -1){
            keys[size] = key;
            values[size] = Value;
            size += 1;
            return;
        }
        values[index] = Value;
    }

    @Override
    public V get(K key) {
        int index = keyIndex(key);
        return values[index];
    }

    @Override
    public List<K> keys() {
        List<K> list_of_keys = new ArrayList<>();
        for (int i = 0; i < keys.length; i++) {
            list_of_keys.add(keys[i]);
        }
        return list_of_keys;
    }
}
