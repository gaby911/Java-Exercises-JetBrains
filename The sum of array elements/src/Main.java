import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numberOfElements = sc.nextInt();
        int[] array = new int[numberOfElements];
        int sum=0;
        for (int i=0;i<numberOfElements;i++){
            int element = sc.nextInt();
            array[i]=element;
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}