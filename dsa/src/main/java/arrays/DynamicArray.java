package arrays;

public class DynamicArray {

    private int[] initialStaticArray;
    private int count;

    public DynamicArray(int initialSize) {
        this.initialStaticArray = new int[initialSize];
        this.count = 0;
    }

    public void insert(int number) {
        if (initialStaticArray.length == count) {
            int[] newArray = new int[count + (count /2)];

            for (int i = 0; i < count; i++) {
                newArray[i] = initialStaticArray[i];
            }
            initialStaticArray = newArray;
        }
        initialStaticArray[count] = number;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Invalid index");
        }
        for (int i = index; i < count; i++) {
            initialStaticArray[i] = initialStaticArray[i++];
        }
        count--;
    }

    public int indexOf(int number) {
        for (int i = 0; i < count; i++) {
            if (initialStaticArray[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(initialStaticArray[i]);
        }
    }
}
