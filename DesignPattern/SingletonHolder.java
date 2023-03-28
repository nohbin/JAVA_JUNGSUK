package DesignPattern;

public class SingletonHolder {

	private SingletonHolder() {
		
	}
	
	private static class LazyHolder {
		public static final SingletonHolder singleton = new SingletonHolder();
	}
	public static SingletonHolder getInstance() {
		return LazyHolder.singleton;
	}
	
	
	
	
}
