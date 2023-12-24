package programs.com;

import java.util.Scanner;

public class ReplaceFirstAndLast {
	
	public static String replace(String s) {
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++) {
			String s3=s1[i];
			char ch1=s3.charAt(0);
			char ch2=s3.charAt(s3.length()-1);
			StringBuffer sb=new StringBuffer(s3);
			sb.setCharAt(0, ch2);
			sb.setCharAt(sb.length()-1, ch1);
			String s4=sb.toString();
			s2+=s4;
			if(i<s1.length)
				s2+=" ";
		}
		return s2;
	}

	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("String after replacing Character: "+replace(s));

	}

}

