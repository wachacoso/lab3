import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

class StringCheckA implements StringChecker {

    @Override
    public boolean checkString(String s) {
        if(s.contains("a") || s.contains("A")) {return true;}
        return false;
    }
}

public class ListTests {
    @Test
    public void testFilter() {
        StringChecker checker = new StringCheckA();
        String[] array = {"apple", "banana", "penguin"};
        List list = Arrays.asList(array);
        String[] expected = {"apple", "banana"};
        List expectedList = Arrays.asList(expected);
        assertEquals(expectedList, ListExamples.filter(list, checker));
    }
    
    @Test
    public void testMerge() {
        String[] array1 = {"apple", "banana", "penguin"};
        List list1 = Arrays.asList(array1);
        String[] array2 = {"apple", "banana", "computer"};
        List list2 = Arrays.asList(array2);
        String[] expected = {"apple", "apple", "banana", "banana", "computer", "penguin"};
        List expectedList = Arrays.asList(expected);
        assertEquals(expectedList, ListExamples.merge(list1, list2));
    }
}
