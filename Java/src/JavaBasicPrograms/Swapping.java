package JavaBasicPrograms;

public class Swapping {
public static void main(String[] args) {
	int[] m= {12,22,33,44,55};
	int temp;
	for(int i=0;i<m.length;i++) {
		for(int j=i+1;j<m.length;j++) {
			if(m[i]<m[j]) {
				temp=m[i];
				m[i]=m[j];
				m[j]=temp;
			}
		}
	}
}
}
