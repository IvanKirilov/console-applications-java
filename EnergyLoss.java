import java.util.Scanner;

public class EnergyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        int energyLoss;
        int sum = 0;
        int totalLeftEnergy;
        double leftEnergyPerDancerPerDay;
        for (int i = 1; i <= days; i++) {
            int hours = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0 && hours % 2 != 0) {
                energyLoss = dancers * 30;
                sum += energyLoss;
            } else if (i % 2 == 0 && hours % 2 == 0) {
                energyLoss = dancers * 68;
                sum += energyLoss;
            } else if (i % 2 != 0 && hours % 2 == 0) {
                energyLoss = dancers * 49;
                sum += energyLoss;
            } else if (i % 2 == 0 && hours % 2 != 0) {
                energyLoss = dancers * 65;
                sum += energyLoss;
                totalLeftEnergy=(100*dancers*days)-sum;
                leftEnergyPerDancerPerDay=totalLeftEnergy/dancers/days;
                if (leftEnergyPerDancerPerDay>50){
                    System.out.printf("They feel good! Energy left: %.2f",leftEnergyPerDancerPerDay);
                }else if (leftEnergyPerDancerPerDay<=50){
                    System.out.printf("They are wasted! Energy left: %.2f",leftEnergyPerDancerPerDay);
                }
            }

        }
    }
}