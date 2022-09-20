//package ArrayList;
//
//import com.Inheritance.List61B;
//
//public class  AList <T> implements List61B<T>{
//    private T[] items;
//    private int size;
//
//
//    public AList(){
//        items = (T[]) new Object[100];
//        size = 0;
//    }
//
//    /* resizes the underlying array to the target capacity */
//    private void resizes(int capacity){
//        T[] a = (T[]) new Object[capacity];  //creates a new array
//        System.arraycopy(items, 0, a, 0, size); // copies elements of the old array to the new one.
//        items = a; // points items to the newly created array.
//    }
//
//    public void addLast(T x){
//        if(size == items.length){
//          resizes(size+2);
//        }
//        items[size] = x;
//        size += 1;
//    }
//
//    public T getLast(){
//        return items[size-1];
//    }
//
//    public T removeLast(){
//        T x = getLast();
//        size -= 1;
//        return x;
//    }
//
//    // Resizing arrays: when the initial array gets full
//
//
//
//
//
//
//
//}
