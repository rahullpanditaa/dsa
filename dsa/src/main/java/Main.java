import bigONotation.QuadraticTime;
import arrays.DynamicArray;
import linkedLists.LinkedListImpl;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedListImpl();
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addFirst(90);
        System.out.println(list.indexOf(40));
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));

    }

}
