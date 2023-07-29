package JavaBasicprogramspractice;

import java.util.Scanner;

public class AscendingOrder {
	public static void AscendingOrder1() {
		int temp;
		int a[]= {12,10,2,3,100};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order:");
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]);

	}
	public static void DescendingOrder() {
		int temp;
		int a[]= {12,10,2,3,100};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Descending Order:");
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]);

	}
public static void main(String[] args) {
	AscendingOrder1();
	DescendingOrder();
}
}
