import java.lang.reflect.Array;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maxArray = new int[n][m];
        int max = Integer.MIN_VALUE;
        for(int i =0; i< n; i++){
            for (int j=0; j<m;j++){
                maxArray[i][j] = sc.nextInt();
            }
        }
        int maxrow=0;
        int maxcol =0;
        for (int i=0;i<maxArray.length;i++){
            for(int j =0;j<maxArray[i].length;j++){
                if(max<maxArray[i][j]){
                    max = maxArray[i][j];
                    maxrow=i;
                    maxcol=j;
                }
            }
        }
        System.out.println(maxrow+" " + maxcol);

    }
}