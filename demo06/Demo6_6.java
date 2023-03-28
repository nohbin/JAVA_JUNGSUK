package demo06;

public class Demo6_6 {
	static double getDistance(int x , int y , int x1, int y1) {
		double d = 0.0;
		
		double a = Math.pow((x1-x),2);
		double b = Math.pow((y1-y),2);
		d = Math.sqrt(a+b);	
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
		
		
	}
}
