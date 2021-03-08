import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++){
            int numar = sc.nextInt();
            if (numar % 6 ==0){
                sum = sum+ numar;
            }
        }
        System.out.println(sum);
    }
}