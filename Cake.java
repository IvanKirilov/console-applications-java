import java.util.Scanner;

public class Cake {
    public static final String STOP = "STOP";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakeSize = width * length;
        int piecesGiven;

        String input;
        for (int i = 0; i < cakeSize; i++) {
            input = scanner.nextLine().toUpperCase();

            if (STOP.equals(input)) {
                System.out.printf("%d pieces are left.", cakeSize);
                break;
            } else {
                piecesGiven = Integer.parseInt(input);
                cakeSize = cakeSize - piecesGiven;
                if (cakeSize <=0) {
                    System.out.printf("No more cake left! You need %d pieces more.",  -cakeSize);
                    break;
                }
            }
        }
    }
}