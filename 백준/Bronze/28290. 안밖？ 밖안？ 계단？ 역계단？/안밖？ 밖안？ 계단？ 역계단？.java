import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("fdsajkl;") || input.equals("jkl;fdsa")){
            System.out.println("in-out");
        }else if(input.equals("asdf;lkj") || input.equals(";lkjasdf")){
            System.out.println("out-in");
        }else if(input.equals("asdfjkl;")){
            System.out.println("stairs");
        }else if(input.equals(";lkjfdsa")){
            System.out.println("reverse");
        }else{
            System.out.println("molu");
        }
    }
}