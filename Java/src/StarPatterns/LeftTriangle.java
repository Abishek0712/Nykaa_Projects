package StarPatterns;

import java.util.Scanner;

public class LeftTriangle {
public static void main(String[] args) {
	System.out.println("Enter the number of rows where stars to be printed ");
	Scanner sc=new Scanner(System.in);
	int rows=sc.nextInt();
	for(int i=0;i<rows;i++) {
		for(int j=2*(rows-i);j>=0;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
