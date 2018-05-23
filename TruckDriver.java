import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String season=scanner.nextLine();
        double kilometersPerMonth=Double.parseDouble(scanner.nextLine());
        double salaryPerKilometer=0;
        double salary=0;
        if(season.equals("Spring")||season.equals("Autumn")){
            if (kilometersPerMonth<=5000){
                salaryPerKilometer=0.75;
            }else if (kilometersPerMonth>5000&&kilometersPerMonth<=10000){
                salaryPerKilometer=0.95;
            }else if (kilometersPerMonth>10000&&kilometersPerMonth<=20000){
                salaryPerKilometer=1.45;
            }
        }else if (season.equals("Summer")){
            if (kilometersPerMonth<=5000){
                salaryPerKilometer=0.90;
            }else if (kilometersPerMonth>5000&&kilometersPerMonth<=10000){
                salaryPerKilometer=1.10;
            }else if (kilometersPerMonth>10000&&kilometersPerMonth<=20000){
                salaryPerKilometer=1.45;
            }
        }else if (season.equals("Winter")){
            if (kilometersPerMonth<=5000){
                salaryPerKilometer=1.05;
            }else if (kilometersPerMonth>5000&&kilometersPerMonth<=10000){
                salaryPerKilometer=1.25;
            }else if (kilometersPerMonth>10000&&kilometersPerMonth<=20000){
                salaryPerKilometer=1.45;
            }
        }
        salary=kilometersPerMonth*salaryPerKilometer*4-(kilometersPerMonth*salaryPerKilometer*4)*0.10;
        System.out.printf("%.2f",salary);
    }
}
