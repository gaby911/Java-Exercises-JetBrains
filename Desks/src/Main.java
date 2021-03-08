import java.awt.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int room1 = scanner.nextInt();
        int room2 = scanner.nextInt();
        int room3 = scanner.nextInt();

        int tables = (int)Math.ceil(((double)room1)/2) +  (int)Math.ceil(((double)room2)/2) + (int)Math.ceil(((double)room3)/2);
        System.out.println(tables);
    }
}