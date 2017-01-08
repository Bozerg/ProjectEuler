package euler;

/**
 * Created by Bozerg on 1/7/2017.
 */
public class euler15 {
    public static void main(String args[]){
        int gridSize=21;
        long[][] grid = new long[gridSize+1][gridSize+1];
        for(int i=0;i<=gridSize;i++){
            grid[i][0]=0;
            grid[0][i]=0;
        }
        for(int i=1;i<=gridSize; i++){
            for(int j=1; j<=gridSize; j++){
                if(i==1&&j==1){
                    grid[1][1]=1;
                }
                else{
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        System.out.println(grid[gridSize][gridSize]);
    }
}
