import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M =sc.nextDouble();
        double P =sc.nextDouble();
        double K =sc.nextDouble();

        int years =0;

        while(K>M){
            M=M*(1+(double)(P/100));
            years++;

        }
        System.out.println(years);
    }
}