import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMinute = Integer.parseInt(scanner.nextLine());

        int examInMinutes = examHour * 60 + examMinute;
        int arriveInMinutes = arrivingHour * 60 + arrivingMinute;

        if (examInMinutes == arriveInMinutes) {
            System.out.println("On time");
        } else if (examInMinutes > arriveInMinutes && (examInMinutes - arriveInMinutes) <= 30) {
            System.out.printf("On time%n%d minutes before the start", examInMinutes - arriveInMinutes);
        } else if (arriveInMinutes > examInMinutes) {
            int late = arriveInMinutes - examInMinutes;
            int hour = late / 60;
            int minutes = late % 60;
            if (hour < 1) {
                System.out.printf("Late%n%d minutes after the start", minutes);
            } else {
                System.out.printf("Late%n%d:%02d hours after the start", hour, minutes);
            }

        } else if (arriveInMinutes < examInMinutes&&(examInMinutes-arriveInMinutes)>30) {
            int early = examInMinutes - arriveInMinutes;
            int hour = early / 60;
            int minutes = early % 60;
            if (hour < 1) {
                System.out.printf("Early%n%d minutes before the start", minutes);
            } else {
                System.out.printf("Early%n%d:%02d hours before the start", hour, minutes);
            }


        }
    }
}