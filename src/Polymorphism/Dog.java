package Polymorphism;

import java.util.Comparator;

public  class Dog implements Comparable<Dog>{

    String name;
    int size;

    Dog(String name, int size){
        this.name = name;
        this.size = size;
    }

    public void bark(){
        System.out.println(name + " says: bark!!");
    }

    @Override
    public int compareTo(Dog uddadog) {
        return this.size - uddadog.size;
    }

    private static class NameComparator implements Comparator<Dog> {
        @Override
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public  static Comparator<Dog> getnameComparator(){
        return new NameComparator();
    }
}
