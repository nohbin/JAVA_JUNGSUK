package demo;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시 분 , 더할 시간을 입력하세요.");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int m1 = sc.nextInt();
		m += m1;
		if (m > 60) {
			h++;
			m = m - 60;
		}
		if (h>23) h=0;
		System.out.println(h + "시" + m +"분");
	}
}
