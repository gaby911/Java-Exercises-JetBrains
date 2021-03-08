import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max =0;
        while (sc.hasNext()){
            int n =sc.nextInt();
            if(n>0){
                if(n>max){
                    max = n;
                }
            }else break;
        }

        System.out.println(max);
    }
}