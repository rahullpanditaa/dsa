package bigONotation;

public class QuadraticTime {

    public static void hello(int[] numbers) {
        // O(n^2)
        for (int first : numbers) {  // O(n)
            for (int second : numbers) { // O(n)
                System.out.println(first + ", " + second);
            }
        }
    }
}
