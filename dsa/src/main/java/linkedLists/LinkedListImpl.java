package linkedLists;

import java.util.NoSuchElementException;

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

    public int indexOf(int value) {
        int index = 0;
        var currentNode = first;
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                return index;
            } else {
                currentNode = currentNode.getNext();
                index++;
            }
        }
        return -1;
    }

    // does the linked list contain the given value
    public boolean contains(int value) {
        if (isEmpty()) {
            return false;
        }
        var currentNode = first;
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                return true;
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return false;
//        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        if (first == last) {
            first = null;
            last = null;
            return;
        } else {
            var secondNode = first.getNext();
            first.setNext(null);
            first = secondNode;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        if (first == last) {
            first = null;
            last = null;
        } else {
            var currentNode = first;
            while (currentNode.getNext() != last) {
                currentNode = currentNode.getNext();
            }
            // current node second last item
            currentNode.setNext(null);
            last = currentNode;
        }

    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (first == last) {
            return 1;
        } else {
            int count = 1;
            var currentNode = first;
            while (currentNode != last) {
                currentNode = currentNode.getNext();
                count++;
            }
            return count;
        }
//        int count = 0;
//        var currentNode = first;
//
//        while (currentNode != null) {
//            count++;
//            currentNode = currentNode.getNext();
//        }
//        return count;
    }

    public int[] toArray() {
        var size = size();
        var array = new int[size];
        var currentNode = first;
        for (int i = 0; i < size; i++) {
            array[i] = currentNode.getValue();
            currentNode = currentNode.getNext();
        }
        return array;
    }

    public void reverse() {
        Node previousNode = null;
        var currentNode = first;
        last = first;
        while (currentNode != null) {
            var nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        first = previousNode;
    }

    // find the kth node of a linked list from the end in one pass
    public Node getKthNodeFromTheEnd(int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be > 0");
        }
        var left = first;
        var right = first;
        for (int i = 0; i < k-1; i++) {
            if (right == null || right.getNext() == null) {
                throw new IllegalArgumentException("k is larger than the size of the linked list");
            }
            right = right.getNext();
        }
        while (right.getNext() != null) {
            left = left.getNext();
            right = right.getNext();
        }
        return left;
    }

   private boolean isEmpty() {
        return first == null;
   }
}
