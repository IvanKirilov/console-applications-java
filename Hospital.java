import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfThePeriod = Integer.parseInt(scanner.nextLine());
        int sumOfUntreatedPatients = 0;
        int sumOfTreatedPatients = 0;
        int doctors = 7;
        for (int i = 1; i <= daysOfThePeriod; i++) {
            int patientsPerDay = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && sumOfUntreatedPatients > sumOfTreatedPatients) {
                doctors++;
            }
            if (patientsPerDay <= doctors) {
                sumOfTreatedPatients += patientsPerDay;
            } else if (patientsPerDay > doctors) {
                sumOfTreatedPatients = sumOfTreatedPatients + doctors;
                sumOfUntreatedPatients +=  patientsPerDay - doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", sumOfTreatedPatients);
        System.out.printf("Untreated patients: %d.", sumOfUntreatedPatients);
    }
}
