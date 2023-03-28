package demo04;

public class Demo04_13 {

	public static void main(String[] args) {
		
		
			String value = "12349";
			char ch = ' ';
			boolean isNumber = true;
			
			// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
			// 하나씩 읽어서 검사한다.
			for(int i=0; i < value.length() ;i++) {
			int a = value.charAt(i);
			
			if(a < 58 && a > 47 ) {
				isNumber = true;
			}else {
				isNumber = false;
				break;	
				}		
			}	
			if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
			} else {
			System.out.println(value+"는 숫자가 아닙니다.");
			}

	}

}
