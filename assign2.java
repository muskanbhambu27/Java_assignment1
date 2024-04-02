package RectAngle;

import java.util.Scanner;
public class assign2 {

	public static void main(String[] args) {
			// outer look
			for (int r = 1; r <= 4; r++) {
				// inner loop
				for (int c = 1; c <= 4; c++) {
					if (r == 1 || r == 4 || c == 1 || c == 4) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println();
			}


		}
}
