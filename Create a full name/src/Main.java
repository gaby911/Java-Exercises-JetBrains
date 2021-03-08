// Don't delete scanner import
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        createFullName(firstName,lastName);


    }

    //implement your method here
    public static String createFullName(String firstName, String lastName){
        String fullName= firstName + " " + lastName;

        return fullName;
    }
}