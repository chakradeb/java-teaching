import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] deck = new int[][] { {1, 0, 1}, {0, 1, 1}, {1, 1, 1} };
        deck[1][2] = 0;
        for(int[] element: deck) {
            System.out.println(Arrays.toString(element));
        }
    }
}


// int - 6
// int[] - [6, 7]
// int[][] - [[6], [7]]