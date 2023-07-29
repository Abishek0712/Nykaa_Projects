package javabasicprograms1;

public class sumfrom1to90 {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=90;i++) {
		if(i%2==0) {
		sum+=i;	
		}
	}
	System.out.println("Sum of numbers from 1 to 90 are "+sum);
}
}
