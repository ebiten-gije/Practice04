package practice04;

public class Ex04 {

	public static void main(String[] args) {
		
		int [] data = {
				1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31
		};
		
		int cot1 = 0, cot2 = 0;
		
		for (int a = 0; a < data.length; a++) {
			if (data[a] % 3 == 0) {
				cot1 += 1;
				cot2 += data[a];
			}
		}

		System.out.println("주어진 배열에서 3의 배수의 개수 =>" + cot1 +
				"\n주어진 배열에서 3의 배수의 합 =>" + cot2);
	}

}
