package demo;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {

		int comNum = (int) ((Math.random() * 100) + 1);
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int minNum = 1;
		int maxNum = comNum;

		int a;
		int b;
		System.out.println(comNum);
		while (true) {
			System.out.println("a 님 차례 입니다.");
			a = sc.nextInt();
			
			if (a == comNum) {
				System.out.println("a 님 정답입니다.");
				break;
			} else if (a > comNum) {
				System.out.println("작은 수를 입력하세요.");
				maxNum = a;

			} else if (a < comNum) {
				System.out.println("큰 수를 입력하세요");
				minNum = a;
			}
			System.out.println("b 님 차례 입니다.");
			b = sc.nextInt();
			if(b<minNum) {
				System.out.println(minNum + " 을 넘는 수를 입력해주세요.");
				b= sc.nextInt();
			}else if(b>maxNum) {
				System.out.println(maxNum + " 를 넘지 않은 수를 입력하세요");
				b=sc.nextInt();
			}
			if (b == comNum) {
				System.out.println("b 님 정답입니다.");
				break;
			} else if (b > comNum) {
				System.out.println("작은 수를 입력하세요.");
			} else if (b < comNum) {
				System.out.println("큰 수를 입력하세요");
			}

		}

	}
}
