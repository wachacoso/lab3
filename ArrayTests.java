import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedMany() {
    int[] input1 = {1, 2, 5, 6, 3, 9};
    int[] expected = {9, 3, 6, 5, 2, 1};
    assertArrayEquals(expected, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedPlaceMany() {
    int[] input1 = {1, 2, 5, 6, 3, 9};
    int[] expected = {9, 3, 6, 5, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expected, input1);
  }
}
