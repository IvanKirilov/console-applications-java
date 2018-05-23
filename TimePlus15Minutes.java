import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
        int timePlusMinutes=(hours*60)+minutes+15;
        int resultTime;
        if (hours>=24){
            hours-=24;
        }
        resultTime=timePlusMinutes%60;
        System.out.printf("%d:%02d",hours,resultTime);
    }
}
