import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();// help us to read all line not only one word/String
        String cityNoSpaces= city.replace(" ","");
        System.out.println(cityNoSpaces.endsWith("burg"));
    }
}