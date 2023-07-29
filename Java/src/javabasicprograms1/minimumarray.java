package javabasicprograms1;

public class minimumarray {
public static void main(String[] args) {
	int[] arr=new int[3];
	arr[0]=23;
	arr[1]=43;
	arr[2]=56;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr[2]);
}
}
