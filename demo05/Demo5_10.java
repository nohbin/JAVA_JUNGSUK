package demo05;

public class Demo5_10 {
	public static void main(String[] args) {

		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc111";
		String result = "";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if(ch>= 97) {
			for (int j = 0; j < 1; j++) {
					result+= abcCode[ch-97];
				}
			}else if(ch>=48 && ch<=57) {
				for (int j = 0; j < 1; j++) {
					result+= numCode[ch-48];
				}
			}
		}
		
		System.out.println("src : " + src);
		System.out.println("result : "+ result);
		
	}
}
