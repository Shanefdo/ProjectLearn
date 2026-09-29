public class ArraysInt {

    public static void main(String[] args) {

        int value = 7;

        int[] values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for (int j : values) {
            System.out.println(j);
        }

        int[] numbers = {5, 10, 15, 20, 25};

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
