package euler;

public class euler7 {
	public static void main(String[] args) {
		int numprimes = 2;
		int currentnum = 5;
		int maxprime = 3;
		int x;
		while(numprimes<=10000){
			x = 2;
			while(x <= Math.sqrt(currentnum)){
				if(currentnum % x == 0){
					currentnum++;
					break;
				}
				else if(x + 1 > Math.sqrt(currentnum)){
					numprimes += 1;
					maxprime = currentnum;
					currentnum++;
					break;
				}
				else x++;
			}
		}
		System.out.println(maxprime);
	}
}
