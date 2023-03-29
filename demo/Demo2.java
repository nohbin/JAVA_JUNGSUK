package demo;

import java.util.Scanner;

public class Demo2 {
	static int a;
	static int p(int n) {
		if(n<=1)
			return n;
		else
			return p(n-1)*n;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 ");
		int n = sc.nextInt();
		System.out.println(p(n));
		
	}
}
