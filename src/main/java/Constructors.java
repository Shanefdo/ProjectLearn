class Machine {

    private String name;
    private int code;

    public Machine() {
        this("Cassy", 0);

        System.out.println("Constructor running!!! ");
        // name = "Cassy";
    }

    public Machine(String name) {
        System.out.println("Second Constructor running!!! ");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third Constructor running!!! ");
        this.name = name;
        this.code = code;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Machine machine1 = new Machine();

//        Machine machine2 = new Machine("ella");
//
//        Machine machine3 = new Machine("Huge", 3344);
    }
}
