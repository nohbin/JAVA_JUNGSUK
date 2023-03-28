package demo06;

class MyPoint{
	int x;
	int y;
	
	public MyPoint(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		double d = 0.0;
		
		double a = Math.pow((x1-this.x),2);
		double b = Math.pow((y1-this.y),2);
		d = Math.sqrt(a+b);	
		return d;
	}
}

public class Demo6_7 {
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
		
	}
}
