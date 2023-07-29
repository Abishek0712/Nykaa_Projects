package JavaBasicprogramspractice;

public class ButterflySnuffle {
public static void main(String[] args) {
	int a[]= {20,10,5,23,100,24,46,67,78,12};
	int len=a.length/2;
	System.out.println("First half part of descending order");
	for(int i=len-1;i>=0;i--) {
		System.out.println(a[i]);
	}
	System.out.println("Second half part of descending order");
		for(int j=a.length-1;j>=len;j--) {
			System.out.println(a[j]);
		}
	
}
}
