package javabasicprograms1;

public class secmaxnumber {
public static void main(String[] args) {
	int[] arr=new int[4];
	arr[0]=23;
	arr[1]=33;
	arr[2]=35;
	arr[3]=56;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr[1]);
}
}
