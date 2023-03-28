package demo05;

import java.util.Scanner;

public class Demo5_12 {
	public static void main(String[] args) {
		String [] questionEng = {"chair","computer","integer"};
		String [] questionKor = {"의자","컴퓨터","정수"};
		Scanner sc = new Scanner(System.in);
		String answer = "";
		for (int i = 0; i < questionKor.length; i++) {
			System.out.printf("Q%d. %s의 뜻은 ? "
					,i+1,questionEng[i]);
			answer = sc.next();
			if(answer.equals(questionKor[i])){
				System.out.println("정답입니다.");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다",questionKor[i]);
			}
		}
	}
}
