import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfElements = sc.nextInt();
        int[] array = new int[numberOfElements];
        int count=0;
        for (int i=0;i<numberOfElements;i++){
            int element = sc.nextInt();
            array[i]=element;
            if(i<=numberOfElements-2){
                if((array[i]< array[i+1])&&(array[i+1]<array[i+2])){
                    count++;
                }
            }
        }
        for (int i=0;i<numberOfElements;i++){
            if(i<=numberOfElements-3){
                if((array[i]< array[i+1])&&(array[i+1]<array[i+2])){
                    if ((array[i+1]-array[i] == 1)&&(array[i+2]-array[i+1] == 1)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}