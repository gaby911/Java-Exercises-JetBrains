import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.next();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i].charAt(j) == arr[i + 1].charAt(j) && arr[i].charAt(j) == arr[i].charAt(j + 1)
                        && arr[i].charAt(j) == arr[i + 1].charAt(j + 1)) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");

    }
}