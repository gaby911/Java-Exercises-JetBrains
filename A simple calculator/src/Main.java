import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n1 = sc.nextLong();
        String s = sc.next();
        long n2 = sc.nextLong();

        switch (s){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                if (n2 ==0){
                    System.out.println("Division by 0!");
                }else {
                    System.out.println(n1 / n2);
                }
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}