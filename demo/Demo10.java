package demo;

import java.util.Arrays;

public class Demo10 {
	public static void main(String[] args) {

		int count = 0;

		while (true) {
			int price = 0;
			int[] arr = new int[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) ((Math.random() * 6) + 1);
			}
			Arrays.sort(arr);

			if (arr[0] == arr[1] && arr[0] == arr[2]) {
				price = 10000 + arr[0] * 1000;
			} else if (arr[0] == arr[1] || arr[1] == arr[2]) {
				price = 1000 + arr[1] * 100;
			} else {
				price = arr[2] * 100;
			}

			for (int i : arr) {
				System.out.println(i);
			}
			System.out.println(price);
			count++;
			if (price > 10000)
				break;
		}
		System.out.println(count);
	}
}
