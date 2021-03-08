public class Main {

    public static void main(String[] args) {
        Secret [] word = Secret.values();
        int count=0;
        for(int i=0;i<word.length;i++){
            String s= word[i].toString();
            if(s.startsWith("STAR")){
                count++;
            }
        }
        System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/