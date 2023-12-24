package programs.com;

import java.util.Scanner;

public class TransposeMatrics {
	
	public static void transpose(int a[][],int row) {
		int n=row;
		int arr[][]=new int[row][row];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the Number of Rows and Columns: ");
		 int row=sc.nextInt();
		 int a[][]=new int[row][row];
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<row;j++) {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 transpose(a,row);
	}
}
