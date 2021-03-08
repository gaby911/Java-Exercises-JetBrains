import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();

        System.out.println(s1.toUpperCase().startsWith("J"));
    }
}