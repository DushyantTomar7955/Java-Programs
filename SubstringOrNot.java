package programs.com;

import java.util.Scanner;

public class SubstringOrNot {
	
	public static boolean substring(String s,String s1) {
		if(s.contains(s1))
			return true;
		return false;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.next();
		System.out.print("Enter the Substring: ");
		String s1=sc.next();
		boolean b=substring(s,s1);
		if(b)
			System.out.println("Yes..It is Substring");
		else
			System.out.println("Not a Substring");

	}

}
