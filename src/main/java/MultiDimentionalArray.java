

public class MultiDimentionalArray {

    public static void main(String[] args) {

        int[] values = {3, 4, 2123};

        System.out.println(values[2]);

        int[][] grid = {
                {3, 4, 2123},
                {3, 4},
                {1, 2, 3, 4}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);


        String[][] texts = new String[2][3];

        texts[0][1] = "Hello world!";

        System.out.println(texts[0][1]);

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }


        String[][] words = {
                {"Hi", "Hello", "Yo"},
                {"Shane", "Claire", "John", "Jack"},
                {"what", "how"},
                {"are you?", "are you doing?", "is your day?"}
        };

        System.out.println(words[0][0] + "\t" + words[1][0] + "\t" + words[2][1] + "\t" + words[3][2]);
    }
}
