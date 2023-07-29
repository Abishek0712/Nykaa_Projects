package java1;

import java2.Access_modifiers;

public class acc_mod extends Access_modifiers{
	public int fib(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
public static void main(String[] args) {
	
	
}
}
