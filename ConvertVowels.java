package programs.com;

import java.util.Scanner;

public class ConvertVowels {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
	    String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				int a=ch-32;
				char c=(char)a;
                 ch=c;
			}
			else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				int a=ch+32;
				char c=(char)a;
				ch=c;
			}
			s2+=ch;
		}
          System.out.println(s2);
	}

}
