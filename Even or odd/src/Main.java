import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int nr =sc.nextInt();
            if (nr == 0) {
                break;
            }
            if (nr % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }


        }

    }
}