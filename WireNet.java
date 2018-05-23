import java.util.Scanner;

public class WireNet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lengthInMetersArea=Integer.parseInt(scanner.nextLine());
        int widthInMetersArea=Integer.parseInt(scanner.nextLine());
        double widthInMetersOfTheNet=Double.parseDouble(scanner.nextLine());
        double pricePerMeterOfTheNet=Double.parseDouble(scanner.nextLine());
        double weightPerSquareMeterOfTheNet=Double.parseDouble(scanner.nextLine());

        int neededNetInMeters=2*lengthInMetersArea+(2*widthInMetersArea);
        double totalPriceOfTheNet=pricePerMeterOfTheNet*neededNetInMeters;
        double netArea=neededNetInMeters*widthInMetersOfTheNet;
        double totalNetWeight=weightPerSquareMeterOfTheNet*netArea;

        System.out.println(neededNetInMeters);
        System.out.printf("%.2f%n",totalPriceOfTheNet);
        System.out.printf("%.3f%n",totalNetWeight);


    }
}
