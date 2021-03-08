import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String s1clean = s1.replaceAll("\\s","");
        String s2clean = s2.replaceAll("\\s","");

        if (s1clean.equals(s2clean)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}