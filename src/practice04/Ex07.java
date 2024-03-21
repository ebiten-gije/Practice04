package practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		Scanner scanner =new Scanner(System.in);
		
		System.out.print("금액: ");
		
		int a = scanner.nextInt();
		
		int c = 0;
		
		for (int b = 0; b < wonArray.length; b++) {

			c = 0;
			
			if (a >= wonArray[b]) {
				
				for ( ;a >= wonArray[b]; ) {
				
					c += 1;
					a = a - wonArray[b];
					
				}
				
				System.out.println(wonArray[b] + "원: " + c + "개");
			}
			
			scanner.close();
		}
		
	}

}
