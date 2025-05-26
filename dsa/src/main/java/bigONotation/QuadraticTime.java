package bigONotation;

public class QuadraticTime {

    public static void hello(int[] numbers) {

        // O(n + n^2) -> concerned with approximation -> O(n^2)

        // O(n)
        for (int num : numbers) {
            System.out.println(num);
        }
        // O(n^2)
        for (int first : numbers) {  // O(n)
            for (int second : numbers) { // O(n)
                System.out.println(first + ", " + second);
            }
        }
    }
}
