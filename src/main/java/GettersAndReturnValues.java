
class PersonIn {
    String name;
    int age;

    void speak(String name, int age) {
        System.out.println("My name is " + name);
    }

    int calculateYearsToRetire() {
        return 65 - age;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}


public class GettersAndReturnValues {

    public static void main(String[] args) {

        PersonIn person3 = new PersonIn();
        person3.name = "joe";
        person3.age = 34;

        int years = person3.calculateYearsToRetire();

        System.out.println("Years till retirement " + years);

        int age = person3.getAge();
        String name = person3.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
