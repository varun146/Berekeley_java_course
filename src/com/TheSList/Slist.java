package com.TheSList;
import com.Inheritance.List61B;

public class Slist<T> implements List61B<T> {

    public class Node {
        public T item;
        public Node next;

        Node(T i, Node next) {
            this.item = i;
            this.next = next;
        }
    }

    private int size;
    private Node sentinel;
    // Constructor for creating an empty list
//    public Slist(){
//        sentinel = new Node(T , null);
//    }

    // Constructor for creating a list with one element
    public Slist(T x) {
        sentinel = new Node(x, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    public int size() {  // Returns the size of the list
        return size;
    }

    public void addFirst(T x) {  // Adds an element to the front of the list
        sentinel.next = new Node(x, sentinel.next);
        size++;
    }

    public T getFirst() { // Gets the first element of the list
        return sentinel.next.item;
    }


    public void addLast(T x) { // Adds an element to the last of the list
        Node temp = sentinel;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(x, null);
        size++;
    }

    public T getLast() {
        Node temp = sentinel;
        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.item;
    }


    public void printList(){
        Node temp = sentinel;
        while(temp.next != null){
            System.out.print(temp.item + "->");
            temp = temp.next;
        }
        System.out.println(" NULL");
    }


    public static void main(String[] args) {
        Slist<Integer> l = new Slist(10);
        l.addFirst(34);
        l.addFirst(67);
        l.addLast(88);
        l.addLast(10000);
        System.out.println(l.getFirst());
        System.out.println(l.size());
        l.addLast(1000);
        l.printList();
        System.out.println(l.getLast());
    }
}
