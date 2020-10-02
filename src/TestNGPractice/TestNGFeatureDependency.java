package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGFeatureDependency {
	
	@Test 
	public void independent(){
		System.out.println("I am independent");
		
//		int i = 10/0;
	}
	
	@Test(dependsOnMethods="independent")
	public void dependent(){
		System.out.println("I am dependent of Independent method");
	}
	@Test(dependsOnMethods="independent")
	public void dependent2(){
		System.out.println("I am dependent2 of Independent method");
	}
	@Test(dependsOnMethods="independent")
	public void dependent3(){
		System.out.println("I am dependent3 of Independent method");
	}

}
