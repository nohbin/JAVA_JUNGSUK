package demo;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {

		int s20;
		int s10;
		int s5;
		int s1;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s20 = n/20;
		s10 = (n%20)/10;
		s5 = ((n%20)%10)/5;
		s1 = (((n%20)%10)%5);
		System.out.println("20 kg : " + s20);
		System.out.println("10 kg : " +s10);
		System.out.println("5 kg : " +s5);
		System.out.println("1 kg : " +s1);
		
		
		
		
		
		
	}
}
