/**
 * 
 */
package org.tutorial.java.lambda;

/**
 * @author deepak
 *
 */
public class BasicLambdaExample {

	public static void main(String []args) {
		
		System.out.println("Learning Lambda");
		
		HelloInterface h = ()->"Hello String";
		System.out.println(h.sayHello());
		
		HelloInterface h1 = ()->"Hi There"; 
		System.out.println(h1.sayHello());
		
		
		IntegerArithmetic addition = (x,y) -> x+y;
		System.out.println("Addition of 10,5 is " + addition.operation(10, 5));
		
		IntegerArithmetic substraction = (x,y) -> x-y;
		System.out.println("Substraction of 5 from 10 is " + substraction.operation(10, 5));
		
	}
}

@FunctionalInterface
interface HelloInterface{
	String sayHello();
}

@FunctionalInterface
interface IntegerArithmetic{
	int operation(int x, int y);
}
