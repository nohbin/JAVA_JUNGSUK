package demo05;

public class Demo5_6 {
	public static void main(String[] args) {
		// 큰금액의 동전을 우선적으로 거슬러 줘야 한다.
		
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for (int i = 0; i < coinUnit.length; i++) {
			int temp = 0;
			temp = money/coinUnit[i];
			System.out.println(coinUnit[i]+"원 :" +temp);
			money = money%coinUnit[i];
		}
		
		
	}
}
