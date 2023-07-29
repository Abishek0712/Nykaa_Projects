package javabasicprograms1;

public class checkwhethergivenprimeornot {
public static void checkgivennumberprimeornot() {
	int a=13;
	int count=0;
	for(int i=2;i<=a/2;i++) {
		if(a%i==0) {
			count++;
		}
	}
	if(count==0) 
	{
		System.out.println("Prime number");
	}
	else 
	{
		System.out.println("Not a prime number");
	}

}
public static void checkseriesofnumbersareprime() {
	System.out.println("primenumbersare");
	for(int a=1;a<=100;a++) {
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(a);
		}
	}
}
	public static void main(String[] args) 
	{
		checkseriesofnumbersareprime();
	}
}
