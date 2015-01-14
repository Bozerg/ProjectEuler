package euler;

public class euler3{
	public static void main(String args[]){
		 long a = 2;
		 long x = 600851475143L;
		 while (x > 1 ){ 
			 if (( x % a) == 0){
				 x = x/a;
			 } 
			 else{ 
				 a++; 
			 } 
		}
	System.out.println(a);
	}
}
  