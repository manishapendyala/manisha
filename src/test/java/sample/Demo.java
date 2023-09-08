package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void m1() {
		Reporter.log("hello",true);
		System.out.println("Boss I am Modified from github");
		
	}

}
