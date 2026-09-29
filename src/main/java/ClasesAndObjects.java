
class Person{
    //Instance variables(data or "state")
    String name;
    int age;

    //Classes can contain

    //1. Data
    //2. Subroutines (methods)
}



public class ClasesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "John Law";
        person1.age = 20;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 34;

        System.out.println(person1.name);
        System.out.println((person2.name));
    }
}
