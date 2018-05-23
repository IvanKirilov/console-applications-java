import java.util.Scanner;

public class SleepingTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hollyDays = Integer.parseInt(scanner.nextLine());
        int workingDays = 365 - hollyDays;
        int totalPlayTime = (hollyDays * 127) + (workingDays * 63);
        int hours, minutes, difference;
        if (totalPlayTime <= 30000) {
            difference = 30000 - totalPlayTime;
            hours = difference / 60;
            minutes = difference % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            difference = totalPlayTime - 30000;
            hours = difference / 60;
            minutes = difference % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }

    }
}
