package linear.linked;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class LinkedListTest {

    @Test
    public void get() {
        int value = 100;
        LinkedList linkedList = new LinkedList(value);

        int i = linkedList.get(0);

        assertThat(i).isEqualTo(value);
    }

    @Test
    public void 리스트_크기를_벗어난_조회() {
        int value = 100;
        LinkedList linkedList = new LinkedList(value);


        assertThatThrownBy(() -> linkedList.get(100));
    }

    @Test
    public void append() {
        int value = 100;
        LinkedList linkedList = new LinkedList(value);

        int appendValue = 1;
        linkedList.append(appendValue);

        assertThat(appendValue).isEqualTo(linkedList.get(1));
    }

    @Test
    void getAll() {
        int value = 1;
        LinkedList linkedList = new LinkedList(value);

        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        int[] all = linkedList.getAll();
        assertThat(all.length).isEqualTo(5);

        for (int i : all) {
            System.out.println("i = " + i);
        }
    }

    @Test
    public void append_임의의_위치에() {
        int value = 1;
        LinkedList linkedList = new LinkedList(value);

        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        int i = 33;
        int index = 3;
        linkedList.append(index, i);

        assertThat(i).isEqualTo(linkedList.get(index));

        int[] all = linkedList.getAll();
        assertThat(all.length).isEqualTo(6);

        for (int n : all) {
            System.out.println("i = " + n);
        }
    }

    @Test
    public void append_크기를_벗어난_위치에() {
        int value = 1;
        LinkedList linkedList = new LinkedList(value);

        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        int i = 33;
        int index = 100;

        assertThatThrownBy(()-> linkedList.append(index, i));
    }

    @Test
    public void append_head에() {
        int value = 1;
        LinkedList linkedList = new LinkedList(value);

        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        int i = 0;
        int index = 0;
        linkedList.append(index, i);

        assertThat(i).isEqualTo(linkedList.get(index));

        int[] all = linkedList.getAll();
        assertThat(all.length).isEqualTo(6);

        for (int n : all) {
            System.out.println("i = " + n);
        }
    }

    @Test
    public void append_tail에() {
        int value = 1;
        LinkedList linkedList = new LinkedList(value);

        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        int i = 6;
        int index = 5;
        linkedList.append(index, i);

        assertThat(i).isEqualTo(linkedList.get(index));

        int[] all = linkedList.getAll();
        assertThat(all.length).isEqualTo(6);

        for (int n : all) {
            System.out.println("i = " + n);
        }
    }
}