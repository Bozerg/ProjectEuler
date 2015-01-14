package euler;

import java.lang.StringBuffer;

public class euler4{
	public static void main(String args[]){
		int max = 1;
		for(int x = 100; x < 999; x++){
			for(int y = 100; y < 999; y++){
				Integer z = x*y;
				StringBuffer test = new StringBuffer();
				test.append(z.toString());
				StringBuffer tset = new StringBuffer();
				tset.append(test.toString());
				tset.reverse();
				String two = tset.toString();
				int rev = Integer.parseInt(two);
				if(rev == z && max < z){
					max = z;
				}
			}
		}
		System.out.println(max);
	}
}