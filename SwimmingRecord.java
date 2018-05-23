import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double recordInSeconds=Double.parseDouble(scanner.nextLine());
        double distanceInMeters=Double.parseDouble(scanner.nextLine());
        double timePerMeterInSeconds=Double.parseDouble(scanner.nextLine());

        double swimmingTime=distanceInMeters*timePerMeterInSeconds;
        double extraTime=Math.floor(distanceInMeters/15)*12.5;
        double totalSwimmingTime=swimmingTime+extraTime;

        if (totalSwimmingTime<recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalSwimmingTime);

        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", (totalSwimmingTime-recordInSeconds));
        }
    }
}
