package com.TheDList;

public class Dlist<T> {

    IntNode head = null;
    IntNode tail = null;
    int size;

    public class IntNode {
        T item;
        IntNode next;
        IntNode prev;

        IntNode(T i, IntNode prev, IntNode next) {
            this.item = i;
            this.prev = prev;
            this.next = next;

        }
    }

    IntNode sentinel;

    public int size(){
        return size;
    }
    public boolean isEmpty() { return size==0;}

    // Adds at the front of the list
    public  void addFirst(T x){
        if(isEmpty()){
            head = tail = new IntNode(x, null, null );
        }else{
            head.prev = new IntNode(x, null, head);
            head = head.prev;
        }
        size++;
    }

    // Adds to the last of the list
    public void addLast(T x){
        if(isEmpty()){
            head = tail = new IntNode(x, null, null );
        }else{
            tail.next = new IntNode(x, tail, null);
            tail = tail.next;
        }
        size++;
    }

    // Prints the list
    public void printList(){
        IntNode p = head;
        System.out.print("NULL <--> ");
        while(p != null){
            System.out.print(p.item + " <--> ");
            p = p.next;
        }
        System.out.println(" NULL");
    }

    public T removeFirst(){
        T elem = head.item;
        head = head.next;
        size--;

        return elem;
    }


    public T removeLast(){
       T elem = tail.item;
       tail = tail.prev;
       tail.next = null;
       size--;

       return elem;
    }

    public T peek(){
        return tail.item;
    }

    public static void main(String[] args) {
//        Dlist<String> head = new Dlist<String>();
//        head.addFirst("Interstellar");
//        head.addLast("Inception");
//        head.addLast("Shutter Island");
//        head.addLast("Ted");
//        head.addFirst("Deadpool");
//        head.printList();
//        System.out.println("Removal of first element in the list");
//        System.out.println(head.removeFirst());
//        System.out.println("Removal of last element in the list");
//        System.out.println(head.removeLast());
//        System.out.println("Here's the updated list");
//        head.printList();

        int a = 1;
        int b = a++ + a++ + a++;
        System.out.println(a + " " + b);

    }


}
