import bigONotation.QuadraticTime;
import arrays.DynamicArray;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        System.out.println(list.contains(44));
        System.out.println(list.indexOf(20));
        System.out.println(list);



    }

}
