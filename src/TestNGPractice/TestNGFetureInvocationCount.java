package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGFetureInvocationCount {
	
	@Test(invocationCount=5)
	public void mul(){
		
		int a = 10;
		int b = 7;
		int c = a*b;
		System.out.println("Multiplication of a and b is : " + c);
	}

}
