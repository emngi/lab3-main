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
  public void testReversed2() {
    int[] input1 = {1,2 };
    assertArrayEquals(new int[]{2,1 }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testRIP () {
    int[] input1 = {1,2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {2,1}, input1);
  }

  @Test 
  public void testAvg (){
  double[] input1 = {2.0, 25.0,30.0, 35.0}; 
  double result = ArrayExamples.averageWithoutLowest(input1);
  assertEquals(30.0, result, 0.01);
  }

  @Test 
  public void testAvg2 (){
  double[] input1 = {2.0, -25.0,30.0, 35.0}; 
  double result = ArrayExamples.averageWithoutLowest(input1);
  assertEquals(22.33, result, 0.01);
  }

  @Test 
  public void testAvg3 (){
  double[] input1 = {0}; 
  double result = ArrayExamples.averageWithoutLowest(input1);
  assertEquals(0.0, result, 0.01);
  }

  @Test 
  public void testAvg4 (){
  double[] input1 = {1}; 
  double result = ArrayExamples.averageWithoutLowest(input1);
  assertEquals(0.0, result, 0.01);
  }

  @Test 
  public void testAvg5 (){
  double[] input1 = {3.0, 4.0, 3.0, 5.0}; 
  double result = ArrayExamples.averageWithoutLowest(input1);
  assertEquals(3.0, result, 0.01);
  }

  
}

