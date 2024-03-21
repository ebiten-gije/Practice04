package practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] sus = new int[5];

		double tot = 0;
		
		for (int a = 0; a < sus.length; a++) {
			sus[a] = scanner.nextInt();
			tot += sus[a];
		}

		System.out.println("평균은 " + (tot/5) + " 입니다");
		scanner.close();
	}

}
