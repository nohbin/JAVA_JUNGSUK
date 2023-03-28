package DesignPattern;

public class Singleton {

	private Singleton() {}
	
	// 최초 한번만 객체를 생성하고 이후 해당 객체를 getInstance 메서드를 활용해 retrun 받아 사용
	private static Singleton singleton = new Singleton();
	
	// 해당 메서드 외에는 Singleton 객체 생성 및 사용 불가.
	public static Singleton getInstance() {
		return singleton;
	}
	
	private static boolean isUse = false;
	
	public static void drvie() {
		isUse = true;
		System.out.println("start driving");
	}
	public static void parkint() {
		isUse = false;
		System.out.println("parking");
	}
	public static boolean isEnalbeUse() {
		return !isUse;
	}
	
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		if(singleton.isEnalbeUse()) {
			singleton.drvie();
		}else {
			System.out.println("no");
		}
		
		
		
		
	}
	
	
}
