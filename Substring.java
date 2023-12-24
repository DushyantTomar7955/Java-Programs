package programs.com;

import java.util.Scanner;

public class Substring {
	
	public static boolean substring(String s,String s2) {
	     int n=s.length();
	     int m=s2.length();
	     boolean b=false;
	     for(int i=0;i<n;i++) {
	    	 if(s.charAt(i)==s2.charAt(0)) {
	    		 int j=i;
	    		 int k=0;
	    		 while(k<m && j<n) {
	    			 if(s.charAt(j)==s2.charAt(k)) {
	    				 k++;
	    				 j++;	
	    			 }	 	 
	    			 else 
	    				 break;
	    			 
	    		 }
	    		 
	    		 if(k==m) {
					 b=true;
					 break;
				 }
	    		 
	    		 
	    	 }
	    	 if(b)
    			 break; 
	    	
	    	
	     }
	     return b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		System.out.print("Enter the Substring: ");
		String s2=sc.nextLine();
		boolean b=substring(s,s2);
        if(b) 
        	System.out.println("It is a Substring");
        else 
        	System.out.println("It is not a Substring");
        
	}

}
