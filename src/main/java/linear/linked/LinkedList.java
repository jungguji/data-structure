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

    public void append(int index, int value) {

        if (index == 0) {
            Node newNode = new Node(value, head);
            head = newNode;
            return;
        }

        Node current = this.head;
        for (int i = 0; i < index-1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("리스트 범위를 벗어남");
            }

            current = current.getNext();
        }

        current.setNext(new Node(value, current.getNext()));
    }

    public int get(int index) {
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("리스트 범위를 벗어남");
            }
            current = current.getNext();
        }

        return current.getValue();
    }

    public int[] getAll() {
        int count = 0;
        Node current = this.head;
        while (current != null) {
            ++count;
            current = current.getNext();
        }

        int[] values = new int[count];

        current = this.head;
        for (int i = 0; i < count; i++) {
            values[i] =current.getValue();
            current = current.getNext();
        }

        return values;
    }
}
