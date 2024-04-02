package RectAngle;

import java.util.Scanner;
public class assign5 {


			public static void main(String[] args) {
				int row=5;
				int star=1;
				int space=4;
				for(int r=1;r<=row;r++)
				{
					for(int i=1;i<=space;i++)
					{
						System.out.print(" ");
						
					}
					
					for(int j=1;j<=star;j++)
					{
						System.out.print("* ");
					}
						
		System.out.println();
		space--;
		star++;
				}
					
				
			

			}

		}


