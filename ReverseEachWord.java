package programs.com;

import java.util.Scanner;

public class ReverseEachWord {
	
	public static String reverseWord(String s) {
	     String s1[]=s.split(" ");
	     String s2="";
	     for(int i=0;i<s1.length;i++) {
	    	 String s3=s1[i];
	    	 StringBuffer sb=new StringBuffer(s3);
	    	 sb.reverse();
//	    	 String s4=sb.toString();
//	    	 s2+=s4;
	    	 s2+=sb.toString();
	    	 if(i<s1.length) {
	    		 s2+=" ";
	    	 }
	     }
		return s2;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.print("Enter the String: ");
         String s=sc.nextLine();
         System.out.println("String After reversing:"+reverseWord(s));
         

	}

}
