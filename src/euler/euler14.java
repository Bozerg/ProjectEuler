package euler;

import java.util.HashMap;

/**
 * Created by Bozerg on 1/7/2017.
 */
public class euler14 {
    public static void main(String[] args) {
        HashMap<Long,Long> nextMap = new HashMap<Long, Long>();
        HashMap<Long,Integer> lengthMap = new HashMap<Long, Integer>();
        int maxLength=1;
        int maxInt=1;
        long curInt;
        long prevInt;
        int curLength;
        nextMap.put(1L,1L);
        lengthMap.put(1L,1);
        for(int i = 2; i < 1000000; i++){
            curInt=i;
            curLength=0;
            while(!lengthMap.containsKey(curInt)) {
                curLength++;
                prevInt=curInt;
                curInt = getNext(curInt);
                nextMap.put(prevInt,curInt);
            }
            curLength=curLength+lengthMap.get(curInt);
            if(curLength>maxLength){
                maxLength=curLength;
                maxInt=i;
            }
            curInt=i;
            while(!lengthMap.containsKey(curInt)){
                lengthMap.put(curInt,curLength);
                curLength--;
                curInt=nextMap.get(curInt);
            }
        }
        System.out.println(maxInt + "  " + maxLength);
    }
    public static long getNext(long x){
        if((x%2)==1){
            return 3*x+1;
        }
        return x/2;
    }
}
