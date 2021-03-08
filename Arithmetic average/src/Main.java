import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nr1= sc.nextInt();
        int nr2= sc.nextInt();
        int sum =0;
        int counter=0;
        for (;nr1<=nr2;){

            if((nr1%3 ==0)||(nr1 == 0)){
                sum = sum+nr1;
                counter++;
            }
            nr1++;
        }
        System.out.println((float)sum/counter);
    }
}