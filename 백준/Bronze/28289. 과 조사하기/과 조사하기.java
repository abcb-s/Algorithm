import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g[] = new int[n];//학년
        int c[] = new int[n];//반
        int num[] = new int[n];//번호
        int f = 0;//1학년
        int s = 0;//소프트웨어개발과
        int im = 0;//임베디드
        int ai = 0;//ai과
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
            c[i] = sc.nextInt();
            num[i] = sc.nextInt();
            if (g[i] == 1){
                f += 1;
            }else if (g[i] == 2 || g[i] == 3){
                if(c[i] == 1 || c[i] == 2){
                    s += 1;
                }else if (c[i] == 3){
                    im += 1;
                }else if (c[i] == 4){
                    ai += 1;
                }
            }

        }
        System.out.println(s);
        System.out.println(im);
        System.out.println(ai);
        System.out.println(f);
    }
}