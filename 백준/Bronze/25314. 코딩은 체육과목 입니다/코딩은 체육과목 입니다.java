import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if(N%4==0){
            count = N/4;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
                sb.append("long ");
            }
            sb.append("int");
            System.out.println(sb.toString());
        }

    }
}