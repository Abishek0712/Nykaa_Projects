package java1;

public class ContrStatements {
public static void main(String[] args) {
	System.out.println("For Loop");
	for(int i=0;i<=5;i++) {
		System.out.println(i);
	}
	int i=0;
	System.out.println("While Loop");
	while(i<=5) {
		System.out.println(i);
		i++;
	}
	do {
		System.out.println(i);
		i++;
	}while(i<=5);
}
}
