import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilometers = Integer.parseInt(input.nextLine());
        String dayOrNight = input.nextLine();
        double transportPrice = 0;
        if (kilometers < 20) {
            if (dayOrNight.equals("day")) {
                transportPrice = 0.70 + (kilometers * 0.79);
            } else if (dayOrNight.equals("night")) {
                transportPrice = 0.70 + (kilometers * 0.90);
            }
        } else if (dayOrNight.equals("day") || dayOrNight.equals("night")) {
            if (kilometers >= 20 && kilometers < 100) {
                transportPrice = 0.09 * kilometers;
            } else if (kilometers >= 100) {
                transportPrice = 0.06 * kilometers;
            }
        }
        System.out.printf("%.02f", transportPrice);
    }
}



       