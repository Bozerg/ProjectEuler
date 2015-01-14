package euler;

public class euler6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int squareofsums = 0;
		int sumofsquares = 0;
		for(int x = 0; x <=100; x ++){
			sumofsquares += x*x;
			squareofsums += x;
		}
		squareofsums *= squareofsums;
		System.out.println(squareofsums - sumofsquares);
	}
	

}
