import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine().toLowerCase();
        String day = sc.nextLine().toLowerCase();
        double qty = Double.parseDouble(sc.nextLine());
        double price;
        if (day.equals("monday") ||
                day.equals("tuesday") ||
                day.equals("wednesday") ||
                day.equals("thursday") ||
                day.equals("friday")) {
            if (fruit.equals("banana")) {
                price = 2.50;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("apple")) {
                price = 1.20;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("orange")) {
                price = 0.85;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("grapes")) {
                price = 3.85;
                System.out.printf("%.2f", price * qty);
            } else {
                System.out.println("error");
            }

        } else if (day.equals("saturday") ||
                day.equals("sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("apple")) {
                price = 1.25;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("orange")) {
                price = 0.90;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
                System.out.printf("%.2f", price * qty);
            } else if (fruit.equals("grapes")) {
                price = 4.20;
                System.out.printf("%.2f", price * qty);
            } else {
                System.out.println("error");
            }

        }else{
            System.out.println("error");
        }
    }

}


