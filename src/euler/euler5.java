package euler;

public class euler5 {
	public static void main(String[] args) {
		boolean keepgoing = true;
		int z = 1;
		while(keepgoing){
			if(z % 19 == 0 &&
					z % 18 == 0 &&
					z % 17 == 0 &&
					z % 16 == 0 &&
					z % 15 == 0 &&
					z % 14 == 0 && 
					z % 13 == 0 &&
					z % 12 == 0 &&
					z % 11 == 0 &&
					z % 10 == 0){
				System.out.println(z);
				keepgoing = false;
			}
			else{
				z += 1;
			}
		}
	}
}
