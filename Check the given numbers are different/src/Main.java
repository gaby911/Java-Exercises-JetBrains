import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1= scanner.nextInt();
        int i2= scanner.nextInt();
        int i3= scanner.nextInt();

        if((i1!=i2)&&(i1!=i3)&&(i2!=i3)){
            System.out.println(true);
        }else System.out.println(false);
    }
}