import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double litersFromP1 = P1 * H;
        double litersFromP2 = P2 * H;
        double totalLitersFromPipes = ((P1 + P2) * H);


        if (totalLitersFromPipes<=V) {
            double poolIsFull = Math.floor((totalLitersFromPipes / V) * 100);
            double P1Percent = Math.floor(litersFromP1 / totalLitersFromPipes * 100);
            double P2Percent = Math.floor(litersFromP2 / totalLitersFromPipes * 100);

            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",
                    poolIsFull, P1Percent, P2Percent);
        } else {
            double poolIsfull=totalLitersFromPipes-V;
            if (H%1==0){
                System.out.printf("For %.0f hours the pool overflows with %.1f liters.",H,poolIsfull);
            }else{
                System.out.printf("For %.1f hours the pool overflows with %.1f liters.",H,poolIsfull);
            }

        }
    }
}