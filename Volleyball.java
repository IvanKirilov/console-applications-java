import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String typeOfYear=scanner.nextLine();
        int p=Integer.parseInt(scanner.nextLine());
        int h=Integer.parseInt(scanner.nextLine());
        double result;
        if (typeOfYear.equals("normal")){
            result=((48-h)*3.0/4)+h+(p*2.0/3);
            System.out.println(Math.floor(result));
        }
        if (typeOfYear.equals("leap")){
            result=(((48-h)*3.0/4)+h+(p*2.0/3))+((((48-h)*3.0/4)+h+(p*2.0/3))*0.15);
            System.out.println(Math.floor(result));
        }
    }
}
