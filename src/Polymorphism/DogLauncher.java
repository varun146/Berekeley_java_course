package Polymorphism;
import java.util.Comparator;
public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog("lisa", 5);
        Dog d2 = new Dog("naumo", 4);
        Dog d3 = new Dog("uklae", 8);

        Dog[] dogs = new Dog[]{d1, d2, d3};
        Dog d =(Dog) Maximizer.max(dogs);
        d.bark();

        Comparator<Dog> nc = Dog.getnameComparator();
        if(nc.compare(d1, d3) > 0) {
            d1.bark();
        } else {
            d3.bark();
        }


    }
}
