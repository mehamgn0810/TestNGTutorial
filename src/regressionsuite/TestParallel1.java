package regressionsuite;

import org.testng.annotations.Test;

public class TestParallel1 {
	
  @Test
  public void test1() throws InterruptedException {
	  System.out.println("Running TestParallel1 -> test1");
	  Thread.sleep(6000);
	  System.out.println("Running TestParallel1 -> test1 -> More Steps");
  }
  @Test
  public void test2() throws InterruptedException {
	  System.out.println("Running TestParallel1 -> test2");
	  Thread.sleep(6000);
	  System.out.println("Running TestParallel1 -> test2 -> More Steps");
  }
}
