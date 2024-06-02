package linear.linked;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListTest {

    @Test
    public void get() {
        int value = 100;
        LinkedList linkedList = new LinkedList(value);

        int i = linkedList.get(0);

        assertThat(i).isEqualTo(value);
    }

    @Test
    public void append() {
        int value = 100;
        LinkedList linkedList = new LinkedList(value);

        int appendValue = 1;
        linkedList.append(appendValue);

        assertThat(appendValue).isEqualTo(linkedList.get(1));
    }
}