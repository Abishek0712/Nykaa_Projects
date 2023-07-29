package JavaBasicPrograms;

public class Armstrongnumbersfrom0to1000 {

	public static void main(String[] args) {
		int i,a=0,sum=0,l=0;
		for(i=1;i<=1000;i++) {
			a=i;
			while(i>0) {
				l=a%10;
				sum=sum+(l*l*l);
				a=a/10;
			}
			if(sum==a) {
				System.out.println("Armstrong number...");
				i++;
			}
			else {
				System.out.println("Not Armstrong number...");
			}
		}
	}

}
