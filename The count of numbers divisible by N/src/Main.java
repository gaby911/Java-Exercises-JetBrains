import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int i=0;
        for (;a<=b;a++){
            if(a%n == 0) i++;
        }
        System.out.println(i);
    }
}