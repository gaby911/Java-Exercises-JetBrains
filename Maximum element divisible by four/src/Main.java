import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int n = sc.nextInt();
        int firstNumber;
        int count = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            int n1 = sc.nextInt();
            if (n1 % 4 == 0) {
                firstNumber = n1;
                count++;
            } else {
                continue;
            }

            for (int j = 1; j <= count; j++) {
                if (firstNumber > max) {
                    max = firstNumber;
                }
            }

        }
        System.out.println(max);
    }
}