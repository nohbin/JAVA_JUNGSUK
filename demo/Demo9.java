package demo;

import java.util.Scanner;

public class Demo9 {
	
	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if(a % i ==0) return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		System.out.println(isPrime(n)); 
		
		
		
	}
}
