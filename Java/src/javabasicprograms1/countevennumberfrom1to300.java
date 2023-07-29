package javabasicprograms1;

public class countevennumberfrom1to300 {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=300;i++) {
		if(i%2==0) {
			count++;
		}
	}
	System.out.println("Total even numbers from 1 to 300 are : "+count);
}
}
