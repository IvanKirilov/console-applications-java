import java.util.Scanner;

public class PhotoPictures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPictures = Integer.parseInt(scanner.nextLine());
        String pictureSize = scanner.nextLine();
        String kindOfOrder = scanner.nextLine();
        double totalPrice;
        if (pictureSize.equals("9X13")) {
            if (kindOfOrder.equals("online") && numberPictures >= 50) {
                totalPrice = numberPictures * 0.16 - (numberPictures * 0.16 * 0.07);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("online") && numberPictures < 50) {
                totalPrice = numberPictures * 0.16 - (numberPictures * 0.16 * 0.02);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures >= 50) {
                totalPrice = numberPictures * 0.16 - (numberPictures * 0.16 * 0.05);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures < 50) {
                totalPrice = numberPictures * 0.16;
                System.out.printf("%.2fBGN", totalPrice);

            }
        }
        if (pictureSize.equals("10X15")) {
            if (kindOfOrder.equals("online") && numberPictures >= 80) {
                totalPrice = numberPictures * 0.16 - (numberPictures * 0.16 * 0.05);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("online") && numberPictures < 80) {
                totalPrice = numberPictures * 0.16 - (numberPictures * 0.16 * 0.03);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures >= 80) {
                totalPrice = numberPictures * 0.16 - (numberPictures * 0.16 * 0.03);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures < 80) {
                totalPrice = numberPictures * 0.16;
                System.out.printf("%.2fBGN", totalPrice);

            }
        }
        if (pictureSize.equals("13X18")) {
            if (kindOfOrder.equals("online") && numberPictures >= 50&&numberPictures<=100) {
                totalPrice = numberPictures * 0.38 - (numberPictures * 0.38 * 0.05);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("online") && numberPictures > 100) {
                totalPrice = numberPictures * 0.38 - (numberPictures * 0.38 * 0.07);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures >= 50&&numberPictures<=100) {
                totalPrice = numberPictures * 0.38 - (numberPictures * 0.38 * 0.03);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures >100 ) {
                totalPrice = numberPictures * 0.38 - (numberPictures * 0.38 * 0.05);
                System.out.printf("%.2fBGN", totalPrice);

            }
        }
        if (pictureSize.equals("20X30")) {
            if (kindOfOrder.equals("online") && numberPictures >= 10&&numberPictures<=50) {
                totalPrice = numberPictures * 2.90 - (numberPictures * 2.90 * 0.09);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("online") && numberPictures > 50) {
                totalPrice = numberPictures * 2.90 - (numberPictures * 2.90 * 0.11);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures >= 10&&numberPictures<=50) {
                totalPrice = numberPictures * 2.90 - (numberPictures * 2.9 * 0.07);
                System.out.printf("%.2fBGN", totalPrice);
            } else if (kindOfOrder.equals("office") && numberPictures >50 ) {
                totalPrice = numberPictures * 2.90 - (numberPictures * 2.90 * 0.09);
                System.out.printf("%.2fBGN", totalPrice);

            }
        }
    }

}
