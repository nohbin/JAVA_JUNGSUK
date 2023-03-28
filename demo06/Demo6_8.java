package demo06;

class PlayingCard{
	
	int kind;	// 인스턴스 변수
	int num;	// 인스턴스 변수
	
	static int width;	//클래스 변수(static)
	static int height;	//클래스 변수(static)
	
	PlayingCard(int k , int n){	// k , n 지역변수
		kind = k;
		num = n;
	}
	
}

public class Demo6_8 {

	public static void main(String[] args) {
	PlayingCard card = new PlayingCard(1, 1);	
		
	}
}
