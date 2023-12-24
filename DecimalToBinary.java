package programs.com;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static String binary(int n) {
		if(n==0)
			return "0";
	
		StringBuffer sb=new StringBuffer();
		while(n>0) {
			int remainder=n%2;
			sb.append(remainder);
			n/=2;
		}
		sb.reverse();
		String s=sb.toString();
		return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Decimal Number: ");
		int n=sc.nextInt();
		System.out.println("Binary Form of Number is: "+binary(n));
		

	}

}
