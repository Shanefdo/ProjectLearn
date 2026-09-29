
class Person {
    //Instance variables(data or "state")
    String name;
    int age;

    //Classes can contain

    //1. Data
    //2. Subroutines (methods)

    void speak() {
        for (int i = 0; i < 5; i++) {
            System.out.println("My Name is: " + name + " and I am " + age + " years old.");
        }
    }

    void sayHello(String name, int age) {
        System.out.println("Show name and age with the method " + name + "\t" + age);
    }
}


public class ClasesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "John Law";
        person1.age = 20;

        person1.speak();
        person1.sayHello("Shane", 30);

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 34;

        person2.speak();

//        System.out.println(person1.name);
//        System.out.println((person2.name));
    }
}
