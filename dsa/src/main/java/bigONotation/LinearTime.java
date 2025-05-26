package bigONotation;

public class LinearTime {

    public void linearTimeOperation(int[] numbers) {
        // O(n) -> the cost (number of operations) grows linearly in direct correlation
        // with increase in input size n

        // O(1 + n + 1) -> O(2 + n) -> O(n)
        System.out.println();   // O(1)
        for (int num : numbers) { // O(n)
            System.out.println(num);
        }
        System.out.println(); // O(1)
    }
}
