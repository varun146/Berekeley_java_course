package Set;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size; // the next item to be added will be at position size

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
//        if (x == null) {
//            throw new IllegalArgumentException("can't add null");
//        }
        if (contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    /** returns an iterator (a.k.a. seer) into ME */
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;
        }

        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }

    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        if(other.getClass() != ArraySet.class){
            return false;
        }
        ArraySet<T> o = (ArraySet<T>) other;
        if(o.size() != this.size()){
            return false;
        }
        for(T item : this){
            if(!o.contains(item)){
                return false;
            }
        }
        return true;
    }

//    @Override
//    public String toString() {
//        StringBuilder returnSB = new StringBuilder("{");
//        for (int i = 0; i < size - 1; i += 1) {
//            returnSB.append(items[i].toString());
//            returnSB.append(", ");
//        }
//        returnSB.append(items[size - 1]);
//        returnSB.append("}");
//        return returnSB.toString();
//    }

    @Override
    public String toString() {
        List<String> listOfItems = new ArrayList<>();
        for (T x : this) {
            listOfItems.add(x.toString());
        }
        return "{" + String.join(", ", listOfItems) + "}";
    }

    /* EXTRA VIDEO CODE
    public static <Glerp> ArraySet<Glerp> of(Glerp... stuff) {
        ArraySet<Glerp> returnSet = new ArraySet<Glerp>();
        for (Glerp x : stuff) {
            returnSet.add(x);
        }
        return returnSet;
    } */


    public static int median(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int mid = left + (right - left)/2;
        if(arr.length % 2 != 0){
            return arr[mid];
        } else {
            int num = (arr[mid] + arr[(mid+1)]);
            return num/2;
        }
    }

    public static <Generic> ArraySet<Generic> of(Generic... stuff) // var args -> variable number of arguments
    {
        ArraySet<Generic> returnSet = new ArraySet<Generic>();
        for(Generic x: stuff){
            returnSet.add(x);
        }
        return returnSet;
    }

    public static void main(String[] args) {
        ArraySet<String> aset = new ArraySet<String>();

        aset.add(null);
        aset.add("dog");
        aset.add("Horse");


//
//        List<Integer> list = new ArrayList<>();
//        list.add(546);
//        list.add(90);
//        list.add(56);
//        System.out.println(list.equals(aset2));
//        System.out.println(list.equals("Hello"));
//        System.out.println(list.equals(56));




//        //iteration
//        for (int i : aset) {
//            System.out.println(i);
//        }
//
//        //toString
//        System.out.println(aset);
//
//        //equals
//        ArraySet<Integer> aset2 = new ArraySet<>();
//        aset2.add(5);
//        aset2.add(23);
//        aset2.add(42);
//
//
//
//        System.out.println(aset.equals(aset2));
//        System.out.println(aset.equals(null));
//        System.out.println(aset.equals("fish"));
//        System.out.println(aset.equals(aset));




        //EXTRA VIDEO CODE
        //ArraySet<String> asetOfStrings = ArraySet.of("hi", "I'm", "here");
        //System.out.println(asetOfStrings);
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}