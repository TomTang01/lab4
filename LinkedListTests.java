import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testLinkedList(){
        LinkedList list = new LinkedList();
        list.prepend(3);
        list.prepend(2);
        list.prepend(1);
        list.append(4);

        assertEquals("1 2 3 4 ",list.toString());
    }
}
