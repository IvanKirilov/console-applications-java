import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double pricePerKgVegetables=Double.parseDouble(scanner.nextLine());
        double pricePerKgFruits=Double.parseDouble(scanner.nextLine());
        int totalVegetablesKg=Integer.parseInt(scanner.nextLine());
        int totalFruitsKg=Integer.parseInt(scanner.nextLine());

        double totalRevenue=((pricePerKgVegetables*totalVegetablesKg)+(pricePerKgFruits*totalFruitsKg))/1.94;
        System.out.println(totalRevenue);

    }
}
