package programs.com;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     String s="";
	     for(int i=0;i<n;i++) {
	         char ch=sc.next().charAt(0);
	         s+=ch;
	    	 
	     }
         String s1="";
         for(int i=n-1;i>=0;i--) {
        	 s1+=s.charAt(i);
         }
         System.out.println(s1);
	}

}
