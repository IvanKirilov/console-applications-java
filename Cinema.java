import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double result;
        if (projection.equals("Premiere")) {
            result = 12 * rows * columns;
            System.out.printf("%.2f", result);
        }
        if (projection.equals("Normal")) {
            result = 7.50 * rows * columns;
            System.out.printf("%.2f", result);
        }
        if (projection.equals("Discount")) {
            result = 5 * rows * columns;
            System.out.printf("%.2f", result);
        }
    }
}
