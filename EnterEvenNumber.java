import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        while (true){
            try {
                System.out.print("Enter even number: ");
                number=Integer.parseInt(scanner.nextLine());
                if (number%2!=0){
                    System.out.print("Number is not even. Enter even number: ");
                }else{
                    break;
                }
            } catch (Exception e){
                System.out.println("invalid number entered!");
            }
        }
        System.out.println("Even number entered: "+number);
    }
}
