import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int busHeight = sc.nextInt();
        int nrBridges = sc.nextInt();
        int count = 0;
        int accident = 0;

//        while (sc.hasNext()) {
////                if (count < nrBridges - 1) {
////                    int bridgeHeight = sc.nextInt();
////                    if (busHeight >= bridgeHeight) {
////                        accident++;
////                    }
////                }else {
////                    break;
////                }
////                count++;
////            }
////            if (accident == 0) {
////                System.out.println("Will not crash");
////            } else {
////                System.out.println("Will crash on bridge " + accident);
////            }
        int i;
        for(i=1;i<=nrBridges;i++){
            int bridgeHeight = sc.nextInt();
            if (busHeight >= bridgeHeight) {
                accident++;
                break;
            }
        }
        if (accident == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + i);
          }

    }
}