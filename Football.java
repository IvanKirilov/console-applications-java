import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;
        for (int i = 1; i <= fans; i++) {
            char sector = scanner.nextLine().charAt(0);
            if (sector == 'A') {
                sectorA++;
            } else if (sector == 'B') {
                sectorB++;
            } else if (sector == 'V') {
                sectorV++;
            }else if (sector=='G'){
                sectorG++;
            }
        }
        double sectorPercentageA=sectorA/fans*100;
        double sectorPercentageB=sectorB/fans*100;
        double sectorPercentageV=sectorV/fans*100;
        double sectorPercentageG=sectorG/fans*100;
        double totalPercentage=(double)fans/capacity*100;
        System.out.printf("%.2f%%%n",sectorPercentageA);
        System.out.printf("%.2f%%%n",sectorPercentageB);
        System.out.printf("%.2f%%%n",sectorPercentageV);
        System.out.printf("%.2f%%%n",sectorPercentageG);
        System.out.printf("%.2f%%%n",totalPercentage);

    }
}
