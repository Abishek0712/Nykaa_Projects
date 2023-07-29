package javabasicprograms1;

import java.util.Scanner;

public class maximumarray {
public static void main(String[] args) {
	int[] arr=new int[4];
	System.out.println("Enter array of elements:");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Maximum number in the array is:"+arr[0]);
}
}
