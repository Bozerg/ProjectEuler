package euler;

import java.util.ArrayList;
public class euler12 {
	public static void main(String[] args) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int count = 0;
		int currentNumber = count;
		while(factors.size() <= 500){
			count++;
			currentNumber += count;
			factors = factors(currentNumber);
		}
		System.out.println(factors.size());
		System.out.println(currentNumber);
	}
	public static ArrayList<Integer> factors(int number){
		ArrayList<Integer> factorList = new ArrayList<Integer>();
		for(int i = 1; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				factorList.add(i);
				factorList.add(number/i);
			}
		}
		return factorList;
	}
}
