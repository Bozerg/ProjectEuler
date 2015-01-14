package euler;

public class euler2{
	public static void main(String args[]){
		int x = 1;
		int y = 1;
		int temp = 0;
		int output = 0;
		while(y < 4000000){
			if(y % 2 == 0){
				output += y;
				temp = y;
				y = x += y;
				x = temp;
			}
			else{
				temp = y;
				y = y += x;
				x = temp;
			}
		}
	System.out.println(output);
	}
}