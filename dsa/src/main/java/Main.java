import bigONotation.QuadraticTime;
import arrays.DynamicArray;
import linkedLists.LinkedListImpl;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedListImpl();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));

    }

}
