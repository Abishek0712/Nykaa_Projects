package javabasicprograms1;

public class ascendingorderarray {
public static void main(String[] args) {
	int[] arr=new int[5];
	arr[0]=23;
	arr[1]=33;
	arr[2]=45;
	arr[3]=56;
	arr[4]=89;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
