import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double lengthInMeters=Double.parseDouble(scanner.nextLine());
        double widthInMeters=Double.parseDouble(scanner.nextLine());
        int bankWidthInCentimeters=70;
        int bankLengthInCentimeters=120;
        int corridorWidthInCentimeters=100;
        int lostBanks=3;

       double realWidth =widthInMeters*100-corridorWidthInCentimeters;
       int banksPerRow=((int)realWidth/bankWidthInCentimeters);
       double rowsInLab=lengthInMeters*100/bankLengthInCentimeters;
        System.out.println((banksPerRow*(int)rowsInLab)-lostBanks);
    }
}
