
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i =0; i< n; i++){
            for (int j=0; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();

        int seatCounter=0;
        int foundRow=0;
        int counter=0;
        int firstRow =0;

        rowloop:for (int i=0;i<n;i++){
            seatCounter = 0;
                    for(int j =0;j<m;j++) {

                    if (matrix[i][j] == 0) {
                        seatCounter++;
                        if (seatCounter == k) {
                            foundRow = i+1;
                            counter++;
                            if(counter==1){
                                firstRow=i;
                            }else if(counter>1){
                                foundRow=firstRow+1;
                            }
                            break rowloop;
                        }
                    } else  {
                        seatCounter = 0;

                    }

            }
        }
        if(foundRow>0){
            System.out.println(foundRow);
        }else {
            System.out.println("0");
        }

    }
}


