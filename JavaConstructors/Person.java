// Program to create a Person class with copy constructor
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Krishnam", 22);
        Person p2 = new Person(p1);  // copying details

        p1.display();
        p2.display();
    }
}
