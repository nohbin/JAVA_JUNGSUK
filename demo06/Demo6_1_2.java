package demo06;
class SutdaCard{
	int num = 0 ;
	boolean isKwang;
	public SutdaCard() {
		this(1, true);
	}
	public SutdaCard(int num, boolean iskwang) {
		super();
		this.num = num;
		this.isKwang = iskwang;
	}
	public String info() {
		return num+ (isKwang?"K":"");
	}
}
public class Demo6_1_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
