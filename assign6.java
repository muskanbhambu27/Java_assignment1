package RectAngle;

import java.util.Scanner;

public class assign6 {


		    public static void main(String[] args) {
		        int rows = 5; // Number of rows in the triangle
		        
		        // Loop through each row
		        for (int i = rows; i >= 1; i--) {
		            
		            // Print spaces to align triangle
		            for (int j = 0; j < rows - i; j++) {
		                System.out.print(" ");
		            }
		            
		            // Print stars for the triangle
		            for (int j = 0; j < 2 * i - 1; j++) {
		                System.out.print("*");
		            }
		            
		            // Move to the next line
		            System.out.println();
		        }
		    }

		}

