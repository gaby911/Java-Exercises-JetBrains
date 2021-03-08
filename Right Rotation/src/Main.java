import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var arr = scanner.nextLine().split(" ");
        var target = scanner.nextInt();
        var len = arr.length;
        var start = len - target % len;
        for (var i = start; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        for (var i = 0; i < start; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}