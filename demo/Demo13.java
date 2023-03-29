package demo;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int sum = 0;
		int count = 0;
		while (a > 0) {
			sum += a % 10;
			a /= 10;
			count++;
		}
		if(n != count) {
			System.out.println("자릿수가 다릅니다.");
			return;
		}
		System.out.println(sum);
	}
}
