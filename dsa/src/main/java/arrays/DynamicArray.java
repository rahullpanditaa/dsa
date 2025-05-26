package arrays;

public class DynamicArray {

    private int[] initialStaticArray;
    private int count;

    public DynamicArray(int initialSize) {
        this.initialStaticArray = new int[initialSize];
        this.count = 0;
    }

    public void insert(int number) {
        // if array is already full, resize
        if (initialStaticArray.length == count) {
            // array is full, need to resize
            // create new array
            int[] newArray = new int[count + (count /2)];

            // copy
            for (int i = 0; i < count; i++) {
                newArray[i] = initialStaticArray[i];
            }

            initialStaticArray = newArray;
        }
        // add the new number to end of array
        initialStaticArray[count] = number;
        count++;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(initialStaticArray[i]);
        }
    }
}
