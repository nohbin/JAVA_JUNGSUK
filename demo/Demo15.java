package demo;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		int temp ;
		int temp1;
		int a = 0;
		int count = 0;
		int temp3 = n;
				
		while(true) {
			temp = (temp3%10)*10;
			temp1 = ((temp3%10)+(temp3/10))%10;
			a = temp + temp1;
			temp3 = a;
			count++;
			if(n==a) {
				break;
			}
		}
		System.out.println(count);
	
		
	}
}
