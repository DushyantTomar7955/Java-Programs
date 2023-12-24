package programs.com;

import java.util.Arrays;
import java.util.Scanner;



public class NthLargestElementOfArray {

    public static int nLargestElement(int a[], int n, int largest) {
        int max = Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--) {
        	if(a[i]<max) {
        		max=a[i];
        		largest--;
        	}
        	if(largest==0)
        		break;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements of Array: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the N value to find Element: ");
        int largest = sc.nextInt();
        int nLargestElement = nLargestElement(a, n, largest);
        System.out.println("N th Largest Element is: " + nLargestElement);
    }
}
