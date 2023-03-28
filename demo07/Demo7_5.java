package demo07;
/*
 * 자손 클래스에서 생성자에서 조상 클래스의 생성자를 호출해야 하는 이유는 ? 
 * - 조상에 정의된 인스턴스 변수들이 초기화디도록 하기 위해서.
 * 
 */

class Product {
	int price;
	int bonusPoint;

	Product() {

	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){}

	@Override
	public String toString() {
		return "Tv";
	}
	
	
}

public class Demo7_5 {
	public static void main(String[] args) {
		Tv t =new Tv();
		
	}

}
