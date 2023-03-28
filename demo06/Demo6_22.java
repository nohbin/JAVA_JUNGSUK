package demo06;

public class Demo6_22 {
	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + " is number ? " +isNumber(str));
		
		str = "abc";
		System.out.println(str + " is number ? " +isNumber(str));
		
		
	}

	public static boolean isNumber(String str) {
		if(str == null|| str.equals("")) return false;
			
		 
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') return false;
		}
		
		return true;
	}
}
