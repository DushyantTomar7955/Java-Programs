package programs.com;

import java.util.Scanner;

public class FrequencyOfCharacter {
	 
	public static void frequency(String s) {
		s=s.toLowerCase();
		int n=s.length();
		int a[]=new int[26];
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=' ') {
			a[s.charAt(i)-'a']++;
			}
		}
		char ch='a';
		for(int i=0;i<26;i++) {
			if(a[i]!=0) {
			System.out.println(ch+"-"+a[i]);
			}
			ch++;
		}
	}

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the String: ");
	   String s=sc.nextLine();
	   frequency(s);

	}

}
