import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Method 1
        // 1. Option +/- sign
        // 2. Whole numbers, 0 or non-zero padded number
        // 3. Optional fraction
        // 4. Single period or comma as seperator
        // 5. Zero or number not ending in zero
        //
        //              11111 2222222222 333333333333333333333333333
        //                                444444 55555555555555555
        String regex = "[-+]?([1-9]+0*|0)([\\.,](0|[0]*\\d*[1-9]+))?";



/*
        Method 2
            1. [+\\-]?0 => 0 preceeded by 0 or 1 instance of + or - sign
            2. [+\\-]?[1-9][0-9]* => First number between 1-9 followed by 0 or more digit from 0-9 preceeded
                                     by 0 or 1 instance of + or - sign
            ([+\\-]?0|[+\\-]?[1-9][0-9]*){1} => 1 or 2 must appear once
            3. [.,]0 => 0 preceeded by . or ,
            4. [.,][0-9]*[1-9] 0 or more digits between 0 to 9 ending with a digit between 1 to 9 preceeded with . or ,
            ([.,]0|[.,][0-9]*[1-9])? => 3 or 4 should appear 0 or 1 time


        String regex = "([+\\-]?0|[+\\-]?[1-9][0-9]*){1}([.,]0|[.,][0-9]*[1-9])?";  */
        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
    }
}