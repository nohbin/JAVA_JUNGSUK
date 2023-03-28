package demo05;

public class Demo5_5 {
	public static void main(String[] args) {

		int[] ballarr = {1,2,3,4,5,6,7,8,9};
		int[]ball3 = new int[3];
		// 배열 ballarr 의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballarr.length; i++) {
			int j = (int)(Math.random() * ballarr.length);
			int temp = 0;
			if(j==0) {
				j++;
			}
			temp = ballarr[j];
			ballarr[j] = ballarr[j-1];
			ballarr[j-1] = temp;
		}
		// 배열 ballarr 의 앞에서 3개의 수를 배열 ball3 로 복사한다.
		for (int i = 0; i < ball3.length; i++) {
			ball3[i] = ballarr[i];
		}
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ballarr[i]+" ");
			
			System.out.print(ball3[i]+" ");
		}
		
	}
}
