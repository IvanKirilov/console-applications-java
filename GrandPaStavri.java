import java.util.Scanner;

public class GrandPaStavri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int days = Integer.parseInt(s.nextLine());
        double liters, degrees, degreesPerDay;
        double sumLiters = 0;
        double sumDegrees = 0;
        double totalDegrees = 0;
        for (int i = 1; i <= days; i++) {
            liters = Double.parseDouble(s.nextLine());
            degrees = Double.parseDouble(s.nextLine());
            degreesPerDay = liters * degrees;
            sumDegrees += degreesPerDay;
            sumLiters += liters;
            totalDegrees = sumDegrees / sumLiters;
        }
        System.out.printf("Liter: %.2f\n", sumLiters);
        System.out.printf("Degrees: %.2f\n", totalDegrees);
        if (totalDegrees < 38) {
            System.out.println("Not good, you should baking!");
        }
        if (totalDegrees >= 38 && totalDegrees <= 42) {
            System.out.println("Super!");
        }
        if (totalDegrees > 42) {

            System.out.println("Dilution with distilled water!");
        }

    }
}
