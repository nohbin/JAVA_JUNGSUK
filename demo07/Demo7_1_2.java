package demo07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	public void shuffle() {
		int r = (int)(Math.random()*cards.length);
		for (int i = 0; i < cards.length; i++) {
			SutdaCard temp;
			temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
			
		}
	}
	
	public SutdaCard pick(int index) {
		return cards[index];
		
	}
	public SutdaCard pick() {
		int r = (int)(Math.random()*cards.length);
		return cards[r];
		
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Demo7_1_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(3));
		System.out.println(deck.pick());
		
		
	}
}
