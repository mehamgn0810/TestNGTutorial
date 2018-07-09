package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.Sum;

public class SoftAsserts {
	
  @Test
  public void test() {
	  
	  Sum s = new Sum();
	  SoftAssert sa = new SoftAssert();
	  int xs= s.sumInt(1, 2);
	  sa.assertEquals(xs, 4);
	  System.out.println("Assert1 Done");
	  sa.assertEquals(xs, 5);
	  System.out.println("Assert2 Done");
	  sa.assertAll();
  }
  
}
