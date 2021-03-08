import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1hours = scanner.nextInt();
        int n1min = scanner.nextInt();
        int n1sec = scanner.nextInt();

        int n2hours = scanner.nextInt();
        int n2min = scanner.nextInt();
        int n2sec = scanner.nextInt();

        int result= n2hours*3600-n1hours*3600 +
                    n2min*60 -n1min*60 +
                    n2sec-n1sec;

        System.out.println(result);
    }
}