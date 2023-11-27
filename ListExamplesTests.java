import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListExamplesTests {
    @Test
    public void testMerge(){
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("a");s1.add("c");
        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("b");s2.add("d");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a");expected.add("b");expected.add("c");expected.add("d");
        assertEquals(expected.get(2), ListExamples.merge(s1, s2).get(2));
    }
}
