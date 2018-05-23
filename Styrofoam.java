import java.util.Scanner;

public class Styrofoam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        double houseArea=Double.parseDouble(scanner.nextLine());
        int windowsNumber=Integer.parseInt(scanner.nextLine());
        double styrofoamPerPackage=Double.parseDouble(scanner.nextLine());
        double packageStyrofoamPrice=Double.parseDouble(scanner.nextLine());


        double realHouseArea=houseArea-(windowsNumber*2.4)+(houseArea-(windowsNumber*2.4))*0.10;
        double neededPackagesStyrofoam=Math.ceil(realHouseArea/styrofoamPerPackage);
        double totalStyrofoamPackagePrice=neededPackagesStyrofoam*packageStyrofoamPrice;
        double budgetSurplus=Math.abs(budget-totalStyrofoamPackagePrice);
        if (budget>totalStyrofoamPackagePrice){
            System.out.printf("Spent: %.2f%nLeft: %.2f",totalStyrofoamPackagePrice,budgetSurplus);

        }else{
            System.out.printf("Need more: %.2f",budgetSurplus);
        }

    }
}
