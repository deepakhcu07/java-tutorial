package org.tutorial.java.bitwise;

public class BitwiseOperatorExample {
	
	
	public int compliment(int number) {
		return ~number;
	}
	
	public int signedLeftShift(int number, int shift) {
		return number << shift;
	}
	
	public int signedRightShift(int number, int shift) {
		return number >> shift;
	}
	
	public int unsignedRightShift(int number, int shift) {
		return number >>> shift;
	}
	
	public int bitwiseAND(int n1, int n2) {
		return n1 & n2;
	}
	
	public int bitwiseOR(int n1, int n2) {
		return n1 | n2;
	}
	
	public int bitwiseXOR(int n1, int n2) {
		return n1 ^ n2;
	}


	public static void main(String []args) {
		System.out.println("Bitwise Operator Example ");
		BitwiseOperatorExample bitwise = new BitwiseOperatorExample();
		
		System.out.println("Complement Operator Example ");
		int number = 32;
		System.out.println(number + " representation in Binary String: " + Integer.toBinaryString(number));
		int result = bitwise.compliment(number);
		System.out.println("Compliment of "+ number +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		
		
		System.out.println("Signed Left Shift Operator Example ");
		int temp = -1;
		result = bitwise.signedLeftShift(temp, 2);
		System.out.println("Signed Left Shift by 2 of "+ temp +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		temp = 5;
		result = bitwise.signedLeftShift(temp, 2);
		System.out.println("Signed Left Shift by 2 of "+ temp +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		
		System.out.println("Signed Right Shift Operator Example ");
		temp = 5;
		result = bitwise.signedRightShift(temp, 2);
		System.out.println("Signed Right Shift by 2 of "+ temp +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		
		temp = -5;
		result = bitwise.signedRightShift(temp, 2);
		System.out.println("Signed Right Shift by 2 of "+ temp +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		
		temp = -1;
		result = bitwise.signedRightShift(temp, 2);
		System.out.println("Signed Right Shift by 2 of "+ temp +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		
		temp = -1;
		result = bitwise.signedRightShift(temp, 5);
		System.out.println("Signed Right Shift by 5 of "+ temp +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		
		System.out.println("Unsigned Right Shift Operator Example ");
		temp = 5;
		result = bitwise.unsignedRightShift(temp, 2);
		System.out.println("Signed Right Shift by 2 of "+ temp +" is "+ result+ " which Binary representation is "+  Integer.toBinaryString(result));
		
		
		
		System.out.println("Bitwise AND Operator Example ");
		int n1 = 5;
		int n2 = 3;
		result = bitwise.bitwiseAND(n1, n2);
		System.out.println("Bitwise AND of numbers "+ n1 +" and "+ n2 + " is "+  result);
		
		
		System.out.println("Bitwise OR Operator Example ");
		n1 = 5;
		n2 = 3;
		result = bitwise.bitwiseOR(n1, n2);
		System.out.println("Bitwise OR of numbers "+ n1 +" and "+ n2 + " is "+  result);
		
		
		System.out.println("Bitwise XOR Operator Example ");
		n1 = 5;
		n2 = 3;
		result = bitwise.bitwiseXOR(n1, n2);
		System.out.println("Bitwise XOR of numbers "+ n1 +" and "+ n2 + " is "+  result);
		
		
		
		
	}
	
	
	
	

}
