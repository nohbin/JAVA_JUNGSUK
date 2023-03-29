package demo;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		double sum = 0;
		
		for (int i = 0; i < 3; i++) {
			int d = sc.nextInt();
			sum += d;
		}
		System.out.println(sum/3);
		
	}

}
