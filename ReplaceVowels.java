package programs.com;

import java.util.Scanner;

public class ReplaceVowels {
     
	public static String vowels(String s) {
		int n=s.length();
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
				count++;
		}
		if(count>3) {
			for(int i=0;i<n;i++) {
				char ch=s.charAt(i);
				if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u') {
					s=s.replace(ch, ' ');
				}
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		System.out.println(vowels(s));
		

	}

}
