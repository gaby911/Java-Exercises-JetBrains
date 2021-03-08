import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = "move";
        switch (n){
            case 1:
                System.out.println(s+" up");
                break;
            case 2:
                System.out.println(s+" down");
                break;
            case 3:
                System.out.println(s+" left");
                break;
            case 4:
                System.out.println(s+" right");
                break;
            case 0:
                System.out.println("do not "+ s);
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}