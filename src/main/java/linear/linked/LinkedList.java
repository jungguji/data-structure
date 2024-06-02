package linear.linked;

public final class LinkedList {

    private Node head;

    public LinkedList(int value) {
        this.head = new Node(value);
    }

    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
        }

        Node current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node(value));
    }

    public int get(int index) {
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }
}
