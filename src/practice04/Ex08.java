package practice04;

public class Ex08 {

	public static void main(String[] args) {
		
		int [] aa = new int [6];
		
		int a = 0;
		while (a < 6) {
			
			int num = (int) (Math.random()*45)+1;
			
			boolean f = false;
			
			for (int i = 0; i < a; i++) {
				
				if (aa[i] == num) {
					f = true;
					break;
				}
				
			}
			
			if (!f) {
				aa[a] = num;
				System.out.print(num + " ");
				a++;
				
			}
			
		}	

	}

}
