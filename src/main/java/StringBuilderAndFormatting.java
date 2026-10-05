

public class StringBuilderAndFormatting {
    public static void main(String[] args) {

        // Inefficient
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        // More efficient
        StringBuilder sb = new StringBuilder();

        sb.append("My Name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Tom.")
                .append(" ")
                .append("I am a Skydiver.");

        System.out.println(s.toString());

        // ********Formatting **********
        System.out.print("Hear is some text.\tThat was a tab.\nThat was a newline");
        System.out.println(" More text.");

        System.out.printf("Tota cost %10d; quantity is %d\n", 5, 120);

        // Formatting integers
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-2d: %s\n", i, "some text here");
        }

        //Formatting Strings
        System.out.printf("Total value: %.2f\n", 5.68759);
        System.out.printf("Total value: %-6.1f\n", 345.68759);
    }
}
