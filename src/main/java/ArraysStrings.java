public class ArraysStrings {

    public static void main(String[] args) {

        String[] values = {"a", "b", "c"};

        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("This is the first element: " + values[0]);


        int value = 0;

        String text = null;

        System.out.println(text);

        String[] texts = new String[3];
        System.out.println(texts[0]);

        String[] texts2 = {
                "Hello",
                "World",
                "!"
        };
        System.out.println(texts2[2]);
    }
}
