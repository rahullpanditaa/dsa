package linkedLists;

public class LinkedListImpl {
    private Node first;
    private Node last;

    // adding a value to start of a linked list
    public void addFirst(int val) {
        // creating a new node that points to the previous head node
        var newFirst = new Node(val, first);

        // changing first/head pointer to point to newly created head node
        first = newFirst;

    }



    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
