import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner= new Scanner(System.in);

        String ipNo= scanner.nextLine();

        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        String correctIp=zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;
        boolean isCorrectIp = ipNo.matches(correctIp);
        if (isCorrectIp){
            System.out.println("YES");

        }else {
            System.out.println("NO");
        }
     }
}