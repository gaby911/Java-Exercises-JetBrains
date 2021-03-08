import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner= new Scanner(System.in);

        String pass= scanner.nextLine();

        String correctPass="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{12,}";

        if(pass.matches(correctPass)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}