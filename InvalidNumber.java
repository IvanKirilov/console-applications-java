import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if(n <100&&n!=0 || n > 200){
            System.out.println("invalid");
        }
    }

}
