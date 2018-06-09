package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FiestTest {
  @Test (priority=0)
  public void f() {
	  Assert.assertTrue(true, "check");
  }
  
  @Test (priority=1)
  public void f1() {
	  Assert.assertFalse(true, "check");
  }
  
  @Test (priority=2)
  public void f2() {
	  Assert.assertTrue(true, "check");
  }
  
  @Test (priority=3)
  public void f3() {
	  Assert.assertTrue(true, "check");
  }
  @BeforeClass
  public void beforeClass() {
	  Assert.assertTrue(true, "check");
  }

  @AfterClass
  public void afterClass() {
	  Assert.assertFalse(true, "check");
  }

}
