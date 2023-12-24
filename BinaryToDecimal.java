package programs.com;

import java.util.Scanner;

public class BinaryToDecimal {
	public static int decimal(String s) {
		int ans=0;
		int count=s.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
                  int k=count;
                  int sum=1;
                  while(k>0) {
                	  sum*=2;
                	  k--;
                  }
                  
                  ans+=sum;
			}
			count--;
		
		}
		return ans;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the String: ");
		 String s=sc.next();
		 int binary=decimal(s);
		 System.out.println("Decimal value of Binary Number is: "+binary);

	}

}
