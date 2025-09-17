package Inheritance.AssistedProblems;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog is a subclass of Animal
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + "Woof Woof!");
    }
}

// Cat is another subclass
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + "Meow!");
    }
}

// Bird subclass
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + "Tweet Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog("Bruno", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Parrot", 1);

        // Polymorphism
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
