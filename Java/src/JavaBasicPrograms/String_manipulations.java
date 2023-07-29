package JavaBasicPrograms;

public class String_manipulations {
	public static void countnoofcharacters() {
		String s="abhish@gmail.com1234";
		int caplett=0;
		int smalllett=0;
		int speciallett=0;
		int numbers=0;
		for(int i=0;i<s.length();i++) {
			if('a'<=s.charAt(i) && s.charAt(i)<='z') {
				smalllett++;
			}
			else if('A'<=s.charAt(i) && s.charAt(i)<='Z') {
				caplett++;
			}
			else if('0'<=s.charAt(i) && s.charAt(i)<='9') {
				numbers++;
			}
			else {
				speciallett++;
			}
		}
		System.out.println("Capital letters inside the given string are:"+caplett);

		System.out.println("Small letters inside the given string are:"+smalllett);
		

		System.out.println("Numbers inside the given string are:"+numbers);

		System.out.println("Special Character letters inside the given string are:"+speciallett);
	}
	
	public static void main(String[] args) {
		countnoofcharacters();
	}
}
