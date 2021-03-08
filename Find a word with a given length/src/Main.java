import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        // write your code here

        String word = "\\b[A-Za-z]{"+ size + "}\\b";

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(line);

        if(matcher.find()) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}