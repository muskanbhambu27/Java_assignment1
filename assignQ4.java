package RectAngle;

import java.util.Scanner;

public class assignQ4 {


	

		public static void main(String[] args) {
			int[] arr = { 4, 7, 2, 9, 1, 5, 8, 3, 6 }; // Sample array

			int secondMin = findSecondMin(arr);
			int secondMax = findSecondMax(arr);

			System.out.println("Second minimum element: " + secondMin);
			System.out.println("Second maximum element: " + secondMax);
		}

		public static int findSecondMin(int[] arr) {
			int min = Integer.MAX_VALUE;
			int secondMin = Integer.MAX_VALUE;

			for (int num : arr) {
				if (num < min) {
					secondMin = min;
					min = num;
				} else if (num < secondMin && num != min) {
					secondMin = num;
				}
			}

			return secondMin;
		}

		public static int findSecondMax(int[] arr) {
			int max = Integer.MIN_VALUE;
			int secondMax = Integer.MIN_VALUE;

			for (int num : arr) {
				if (num > max) {
					secondMax = max;
					max = num;
				} else if (num > secondMax && num != max) {
					secondMax = num;
				}
			}

			return secondMax;
		}
	}
