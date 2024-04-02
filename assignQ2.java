package RectAngle;

import java.util.Scanner;

public class assignQ2 {

			public static void main(String[] args) {
			int[] array = { 5, 10, 15, 20, 25 };

			int max = array[0],sum =0; 

			for (int i = 0; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i]; 
				}
				sum += array[i]; 
			}

			double average = (double) sum / array.length; 

			System.out.println("Maximum element in the array: " + max);
			System.out.println("Average of elements in the array: " + average);
		}
	}
