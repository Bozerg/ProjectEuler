package euler;

/**
 * Created by Bozerg on 1/7/2017.
 */
public class euler16 {
    public static void main(String args[]){
        int maxPow = 1000;
        int[] arr = new int[maxPow/3];
        int sum=0;
        arr[1]=1;
        int leadingTerm=1;
        for(int i = 1; i <= maxPow; i++){
            for(int j = 1; j<=leadingTerm; j++){
                arr[j]=arr[j]*2;
            }
            for(int j = 1; j<leadingTerm; j++){
                if(arr[j]>=10){
                    arr[j]=arr[j]%10;
                    arr[j+1]=arr[j+1]+1;
                }
            }
            if(arr[leadingTerm]>=10){
                arr[leadingTerm]=arr[leadingTerm]%10;
                leadingTerm++;
                arr[leadingTerm]=1;
            }
        }
        for(int i =1; i<=leadingTerm;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
