import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        /* write your code here */
        String correctNum="[ABEKMHOPCTYX][0-9]{3}[ABEKMHOPCTYX]{2}";

        boolean isCorrect = regNum.matches(correctNum);
        System.out.print(isCorrect);
    }
}