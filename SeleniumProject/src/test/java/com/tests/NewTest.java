package com.tests;

import org.testng.annotations.Test;

public class NewTest {
  @Test	(priority=2)				//@test "Its annotations" will execute the methods as tests 
  public void f() { 	//test method
	  System.out.println("in f()");
  }
  
  @Test
  public void test1() {
	  System.out.println("in Test1()");
  }
  
  @Test
  public void test2() {
	  System.out.println("in Test2()");
  }
  
  @Test
  public void test3() {
	  System.out.println("in Test3()");
  }
  
  @Test
  public void test4() {
	  System.out.println("in Test4()");
  }
  
}
