package linkedLists;

public class LinkedListImpl {
    private Node first;
    private Node last;


    // adding a value to end of linked list
    public void addLast(int value) {
        var node = new Node(value);

        // if list is empty,
        if (first == null) {
            this.first = node;
            this.last = node;
        } else { // if the linked list has at least one node present
            last.setNext(node);
            last = node;
        }
    }

    // addFirst
    public void addFirst(int number) {
        var node = new Node(number);

        if (first == null) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }



    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
