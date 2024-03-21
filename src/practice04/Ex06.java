package practice04;

public class Ex06 {

	public static void main(String[] args) {
		
		char c [] = {
				'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 
				'c', 'i', 'l'
		};
		

		for (int a = 0; a < c.length; a++) {
			System.out.print(c[a]);
		}

		for (int b = 0; b < c.length; b++) {
			
			if (c[b] == ' ') {
				c[b] = ',';
			}
		
			System.out.print(c[b]);
		
		}
		
	}

}
