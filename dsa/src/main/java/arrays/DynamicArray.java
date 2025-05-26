package arrays;

public class DynamicArray {

    private int[] initialStaticArray;
    private int count;

    public DynamicArray(int initialSize) {
        this.initialStaticArray = new int[initialSize];
        this.count = 0;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(initialStaticArray[i]);
        }
    }
}
