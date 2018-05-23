import java.util.Scanner;

public class GrapeAndRakia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double area=Double.parseDouble(scanner.nextLine());
        double kgPerMeter=Double.parseDouble(scanner.nextLine());
        double loss=Double.parseDouble(scanner.nextLine());

        double grapeQty=(area*kgPerMeter)-loss;
        double grapeForRakia=grapeQty*0.45;
        double rakiaQty=grapeForRakia/7.5;
        double rakiaRevenue=rakiaQty*9.80;
        double grapeRevenue=grapeQty*0.55*1.50;
        System.out.printf("%.2f%n",rakiaRevenue);
        System.out.printf("%.2f%n",grapeRevenue);
    }
}
