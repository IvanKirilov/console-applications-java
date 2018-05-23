import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double parcelInKg=Double.parseDouble(scanner.nextLine());
        String typeoddelivery=scanner.nextLine();
        int distanceInKm=Integer.parseInt(scanner.nextLine());

        double pricePerKm=0;

        if (typeoddelivery.equals("standard")) {
            if (parcelInKg < 1) {
                pricePerKm = 0.03;
            } else if (parcelInKg > 1 && parcelInKg <= 10) {
                pricePerKm = 0.05;
            } else if (parcelInKg > 11 && parcelInKg <= 40) {
                pricePerKm = 0.10;
            } else if (parcelInKg > 41 && parcelInKg <= 90) {
                pricePerKm = 0.15;
            } else if (parcelInKg > 91 && parcelInKg <= 150) {
                pricePerKm = 0.20;
            }
        }else if (typeoddelivery.equals("express")){
            if (parcelInKg < 1) {
                pricePerKm = 0.03+(0.03*0.80)*parcelInKg;
            } else if (parcelInKg > 1 && parcelInKg <= 10) {
                pricePerKm = 0.05+(0.05*0.40)*parcelInKg;
            } else if (parcelInKg > 11 && parcelInKg <= 40) {
                pricePerKm = 0.10+(0.10*0.05)*parcelInKg;
            } else if (parcelInKg > 41 && parcelInKg <= 90) {
                pricePerKm = 0.15+(0.15*0.02)*parcelInKg;
            } else if (parcelInKg > 91 && parcelInKg <= 150) {
                pricePerKm = 0.20+(0.20*0.01)*parcelInKg;
            }
            }
            double totalPrice=pricePerKm*distanceInKm;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",parcelInKg,totalPrice);
    }
}
