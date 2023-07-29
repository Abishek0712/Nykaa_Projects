package JavaBasicPrograms;

public class AscendingOrder {
	public static void ascending() {
		int temp;
		int a[]= {20,10,10,6,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println("Ascending order is:");
		for(int j=0;j<a.length;j++)
			System.out.println(a[j]);
	}
	public static void descending() {
		int temp;
		int b[]= {12,21,13,56,100};
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]<b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("Descending Order is:");
		for(int j=0;j<b.length;j++)
			System.out.println(b[j]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ascending();
		descending();
	}

}
