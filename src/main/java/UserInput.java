import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
//
//        // Prompt the user to enter a line of text
//        System.out.println("Enter a line of text: ");
//
//        //Wait for the user to enter a line of text and store it in a variable
//        String line = input.nextLine();
//
//        //Tell them what they entered
//        System.out.println("You entered: " + line);
//
//
//        //----
//
//        // Prompt the user to enter a line of integer
//        System.out.println("Enter a line of integer: ");
//
//        //Wait for the user to enter a line of int and store it in a variable
//        int value = input.nextInt();
//
//        //Tell them what they entered
//        System.out.println("You entered: " + value);
//
//        //----
//
//        // Prompt the user to enter a line of double
//        System.out.println("Enter a line of double: ");
//
//        //Wait for the user to enter a line of double and store it in a variable
//        double doubleValue = input.nextDouble();
//
//        //Tell them what they entered
//        System.out.println("You entered: " + doubleValue);


        //----if statement build bast on the input value

        System.out.println("Enter any value: ");

        //Wait for the user to enter any value and store it in a variable

        if (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println("You entered a string: " + line);
        } else if (input.hasNextInt()) {
            int value = input.nextInt();
            System.out.println("You entered an integer: " + value);
        } else if (input.hasNextDouble()) {
            double doubleValue = input.nextDouble();
            System.out.println("You entered a double: " + doubleValue);
        } else {
            System.out.println("Invalid input");
        }
    }
}
