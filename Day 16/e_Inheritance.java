public class e_Inheritance {
    public static void main(String[] args) {
        Fish salmon = new Fish();
        salmon.eat();  
        
        Dog dog = new Dog();
        dog.hasBackbone(); // from Vertebrate
        dog.hasHair();     // from Mammal
        dog.bark();       // from Dog
    }   
}

// Single Inheritance Example
// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
}
// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

// Multi-level Inheritance Example
class Vertebrate {
    void hasBackbone() {
        System.out.println("Has backbone");
    }
}
class Mammal extends Vertebrate {
    void hasHair() {
        System.out.println("Has hair");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("Barks");
    }
}

// Hierarchical Inheritance Example
class Vehicle {
    void run() {
        System.out.println("Runs");
    }
}
class Car extends Vehicle {
    void wheels() {
        System.out.println("4 wheels");
    }
}
class Bike extends Vehicle {
    void wheels() {
        System.out.println("2 wheels");
    }
}

// Hybrid Inheritance Example
class Machine {
    void start() {
        System.out.println("Starts");
    }
}
class Computer extends Machine {
    void compute() {
        System.out.println("Computes");
    }
}
class Laptop extends Computer {
    void portable() {
        System.out.println("Portable");
    }
}
class Desktop extends Computer {
    void stationary() {
        System.out.println("Stationary");
    }
}