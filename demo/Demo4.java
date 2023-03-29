package demo;

public class Demo4 {
	public static void main(String[] args) {
		boolean isGood = false;
		
		for (int i = 1; i <=100; i++) {
			int n = 0;
			if(i%10 == 3 || i%10 == 6 || i%10 ==9
			||i/10 == 3 || i/10 == 6 ||i/10 == 9) {
			}else {
				System.out.println(i);
			}
			
		}
		
		
		
	}
}
