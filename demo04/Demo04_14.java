package demo04;

import java.util.Scanner;

public class Demo04_14 {

	public static void main(String[] args) {
		
		
	int comNum = (int)((Math.random()*100)+1);
	int playerNum = 0;
	int cnt = 0;
	System.out.println("컴퓨터 숫자 맞추기 게임!");
	
	Scanner sc = new Scanner(System.in);
	boolean isDone = false;
	while (!isDone) {
		cnt++;
		System.out.println("숫자를 입력하세요");
		playerNum = sc.nextInt();
		if (playerNum>comNum) {
			System.out.println("더 작습니다.");
		}else if(playerNum<comNum) {
			System.out.println("더 큽니다.");
		}else {
			System.out.println("정답입니다.");
			System.out.println("총 시도 횟수는 : " + cnt);
			isDone = true;
		}
	}
	
	sc.close();
	


	}

}
