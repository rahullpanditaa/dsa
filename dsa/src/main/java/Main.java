import bigONotation.QuadraticTime;
import arrays.DynamicArray;
import linkedLists.LinkedListImpl;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedListImpl();
        list.addLast(40);
        list.removeFirst();
        System.out.println(list.contains(40));

    }

}
