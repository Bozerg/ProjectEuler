package euler;

public class euler1{
	public static void main(String args[]){
		int output = 0;
		for(int i = 1; i<1000; i++){
			if(((i % 3) == 0) || ((i % 5) == 0)){
				output = output + i;	
			}
		}
		System.out.println(output);
	}
}
