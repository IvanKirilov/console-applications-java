import java.util.Scanner;

public class ExternalEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPupils = Integer.parseInt(scanner.nextLine());

        double poorMarkCounter = 0;
        double satisfactoryMarkCounter = 0;
        double goodMarkCounter = 0;
        double veryGoodMarkCounter = 0;
        double excellentMarkCounter = 0;
        for (int i = 1; i <= numberOfPupils; i++) {

            double mark = Double.parseDouble(scanner.nextLine());

            if (mark >= 0 && mark < 22.5) {
                poorMarkCounter++;
            } else if (mark >= 22.5 && mark < 40.5) {
                satisfactoryMarkCounter++;
            } else if (mark >= 40.5 && mark < 58.5) {
                goodMarkCounter++;
            } else if (mark >= 58.5 && mark < 76.5) {
                veryGoodMarkCounter++;
            } else if (mark >= 76.5 && mark <= 100) {
                excellentMarkCounter++;
            }
        }
        double totalPoorMarkPercentage = (poorMarkCounter / numberOfPupils) * 100;
        double totalSatisfactoryMarkPercentage = (satisfactoryMarkCounter / numberOfPupils) * 100;
        double totalGoodMarkPercentage = (goodMarkCounter / numberOfPupils) * 100;
        double totalVeryGoodMarkPercentage = (veryGoodMarkCounter / numberOfPupils) * 100;
        double totalExcellentMarkPercentage = (excellentMarkCounter / numberOfPupils) * 100;

        System.out.printf("%.2f%% poor marks%n",totalPoorMarkPercentage);
        System.out.printf("%.2f%% satisfactory marks%n",totalSatisfactoryMarkPercentage);
        System.out.printf("%.2f%% good marks%n",totalGoodMarkPercentage);
        System.out.printf("%.2f%% very good marks%n",totalVeryGoodMarkPercentage);
        System.out.printf("%.2f%% excellent marks%n",totalExcellentMarkPercentage);

    }
}
