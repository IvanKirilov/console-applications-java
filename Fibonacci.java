import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int digit1=1;
        int digit2=1;
        if (n<2){
            System.out.println(digit1);return;
        }
        for (int i=0;i<n-1;i++){
            int nextDigit=digit1+digit2;
            digit1=digit2;
            digit2=nextDigit;

        }
        System.out.println(digit2);
    }
}
