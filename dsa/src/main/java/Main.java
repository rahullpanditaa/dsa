import bigONotation.QuadraticTime;
import arrays.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray numbers = new DynamicArray(3);

        numbers.insert(10);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(44444);
        numbers.removeAt(3);
        numbers.insert(9);
        System.out.println(numbers.indexOf(9));
        System.out.println(numbers.indexOf(100000));
        numbers.print();


    }

}
