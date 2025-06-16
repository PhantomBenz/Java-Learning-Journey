public class h_AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }    
}

abstract class Animal {

    Animal() {
        System.out.println("animal constructor");
    }

    void eat() {
        System.out.println("animal eats");
    } 

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor");
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("chicken constructor");
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
