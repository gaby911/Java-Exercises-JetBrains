import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1) { System.out.print(n + " ");

        }else {
            System.out.print(n +" ");
            while (n>1) {
                if(n%2 == 0){
                    n=n/2;
                    System.out.print(n + " ");

                }else {
                    n=n*3 +1;
                    System.out.print(n +" ");

                }
            }

        }



    }
}