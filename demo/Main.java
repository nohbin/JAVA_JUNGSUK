package demo;

public class Main {

	public static void main(String[] args) {

		int [][]aa = new int[3][4];
		
		int i =0;
		int k = 0;
		int val = 1;
		
		while (i<3) {
			while (k<4) {
				aa[i][k]=val;
				val++;
				k++;
			}
			k=0;
			i++;
		}
		
		for (int j = 0; j < 3; j++) {
			for (int j2 = 0; j2 < 4; j2++) {
				System.out.print(aa[j][j2] +" ");
			}System.out.println();
		}
		
		
	}

}
