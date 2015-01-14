package euler;

public class euler9 {
	public static void main(String[] args) {
		double c = 1;
		for(int a = 1; a < 1000; a++){
			for(int b = 1; b <= a; b++){
				c = Math.sqrt(a*a+b*b);
				if((int) c == c){
					if(a + b + (int) c == 1000){
						System.out.println(a*b* (int) c);
					}
				}
			}
		}
	}
}
