import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       int S = sc.nextInt();
       if(T <= 11){
           System.out.println("280");
       } else if (T >= 12 && T <= 16) {
           if(S==0){
               System.out.println("320");
           }else if(S==1){
               System.out.println("280");
           }
       }else if (T > 16) {
           System.out.println("280");
       }

    }
}