import java.util.Scanner;

public class DigitCalculations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int digit1=Integer.parseInt(scanner.nextLine());
        int digit2=Integer.parseInt(scanner.nextLine());
        String mathOperator=scanner.nextLine();
        double result1=0;
        int result2=0;

        if (mathOperator.equals("/")){
            if (digit2==0){
                System.out.printf("Cannot divide %d by zero",digit1);
            }else{
                result1=(double)digit1/digit2;
                System.out.printf("%d / %d = %.2f",digit1,digit2,result1);
            }
        }else if (mathOperator.equals("%")){
            if (digit2==0){
                System.out.printf("Cannot divide %d by zero",digit1);
            }else {
                result2=digit1%digit2;
                System.out.printf("%d %% %d = %d",digit1,digit2,result2);
            }

        }else if (mathOperator.equals("+")){
            result2=digit1+digit2;
            if (result2%2==0){
                System.out.printf("%d + %d = %d - even",digit1,digit2,result2);
            }else{
                System.out.printf("%d + %d = %d - odd",digit1,digit2,result2);
            }
        }else if (mathOperator.equals("-")){
            result2=digit1-digit2;
            if (result2%2==0){
                System.out.printf("%d - %d = %d - even",digit1,digit2,result2);
            }else{
                System.out.printf("%d - %d = %d - odd",digit1,digit2,result2);
            }
        }else if (mathOperator.equals("*")){
            result2=digit1*digit2;
            if (result2%2==0){
                System.out.printf("%d * %d = %d - even",digit1,digit2,result2);
            }else{
                System.out.printf("%d * %d = %d - odd",digit1,digit2,result2);
            }
        }

    }
}
