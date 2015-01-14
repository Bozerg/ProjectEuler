package euler;

public class euler10 {
	public static void main(String[] args) {
		int currentnumber = 2;
		long sum = 0;
		int[] numlist = new int[2000000];
		for(int i = 0; i < 2000000; i++){
			numlist[i] = i + 1;
		}
		numlist[0] = 0;
		while(currentnumber < Math.sqrt(2000000)){
			for(int i = currentnumber; i < Math.sqrt(2000000) - currentnumber; i += currentnumber){
				System.out.println(numlist[i-1]);
				numlist[i - 1 + currentnumber] = 0;
			}
			currentnumber++;
		}
		for(int i = 0; i < 2000000; i++){
			sum += numlist[i];
		}
		System.out.println(sum);
	}
}
