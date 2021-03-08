import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        if (nr%2 ==0){
            nr+=2;
        }else{
            nr+=1;
        }
        System.out.println(nr);
    }
}