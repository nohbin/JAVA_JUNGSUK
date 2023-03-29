package demo;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x 및 y 의 좌표는?");
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		if(x>0&&y>0) {
			System.out.println("1사분면");
		}else if (x>0 && y <0) {
			System.out.println("4사분면");
		}else if (x<0 && y<0) {
			System.out.println("3사분면");	
		}else if(x<0 && y>0 ) {
			System.out.println("2사분면");
		}else {
			System.out.println("원점");
		}
		
	}
}
