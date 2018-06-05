package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.Sum;

public class assertsTest {
	Sum s = new Sum();
	
  @Test
  public void test1() {
	  System.out.println("Running Test1");
	  int result = s.sumInt(1, 2);
	  Assert.assertEquals(result, 3);
	  System.out.println("Test1 passed\n");
  }
  
  @Test
  public void test2() {
	  System.out.println("Running Test2");
	  String result = s.sumStr("Hello", "World!");
	  Assert.assertEquals(result, "Hello World!");
	  System.out.println("Test2 Passed\n");
  }
  
  @Test
  public void test3() {
	  System.out.println("Running Test3");
	  int[] expectedArr = {1,2,3,4};
	  int[] actualArr = s.getArray();
	  Assert.assertEquals(actualArr, expectedArr);
	  System.out.println("Test3 Passed\n");
  }
}
