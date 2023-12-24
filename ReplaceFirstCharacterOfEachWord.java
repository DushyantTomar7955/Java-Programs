package programs.com;

import java.util.Scanner;

public class ReplaceFirstCharacterOfEachWord {
	
	public static String replace(String s) {
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length-1;i++) {
		  int j=i+1;
		  char ch2=s1[j].charAt(0);
		  String s3=s1[i];
		  StringBuffer sb=new StringBuffer(s3);
		  sb.setCharAt(0, ch2);
		  String s4=sb.toString();
		  s2+=s4;
		  if(i<s1.length)
			  s2+=" ";
		  
		  
		  
		  
			
		}
		s2+=s1[s1.length-1];
		return s2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		System.out.println("After Replacing of Words: "+replace(s));

	}

}
