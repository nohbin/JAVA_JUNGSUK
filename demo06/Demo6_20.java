package demo06;

import java.util.Arrays;

public class Demo6_20 {
	
	public static  int[] shuffle(int [] arr) {
		int r = (int)(Math.random()*arr.length);
		
		for (int i = 0; i < arr.length; i++) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;
				
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int [] result = shuffle(original);
		System.out.println(Arrays.toString(result));
		
		char min = 48;
		System.out.println(min);
		
	}
}
