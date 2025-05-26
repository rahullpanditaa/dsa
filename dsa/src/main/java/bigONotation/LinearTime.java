package bigONotation;

public class LinearTime {

    public void linearTimeOperation(int[] numbers) {
        // O(n) -> the cost (number of operations) grows linearly in direct correlation
        // with increase in input size n

        // O(2n) -> O(n)
        for (int num : numbers) { // O(n)
            System.out.println(num);
        }

        for (int num : numbers) { // O(n)
            System.out.println(num);
        }
    }
}
