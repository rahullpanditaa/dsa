package bigONotation;

public class LinearTime {

    public void linearTimeOperation(int[] numbers, String[] words) {
        // O(n) -> the cost (number of operations) grows linearly in direct correlation
        // with increase in input size n

        // O(m+n) -> O(n) since runtime still increases linearly
        for (int num : numbers) { // O(n)
            System.out.println(num);
        }

        for (String s : words) { // O(m)
            System.out.println(s);
        }
    }
}
