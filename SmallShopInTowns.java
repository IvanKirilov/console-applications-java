import java.util.Scanner;

public class SmallShopInTowns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String good = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double qty = Double.parseDouble(scanner.nextLine());
        double price;
        if (good.equals("coffee")) {
            if (town.equals("sofia")) {
                price = 0.50;
                System.out.println(qty * price);
            } else if (town.equals("plovdiv")) {
                price = 0.40;
                System.out.println(qty * price);
            } else if (town.equals("varna")) {
                price = 0.45;
                System.out.println(qty * price);
            }
        }
        if (good.equals("water")) {
            if (town.equals("sofia")) {
                price = 0.80;
                System.out.println(qty * price);
            } else if (town.equals("plovdiv")) {
                price = 0.70;
                System.out.println(qty * price);
            } else if (town.equals("varna")) {
                price = 0.70;
                System.out.println(qty * price);
            }
        }
        if (good.equals("beer")) {
            if (town.equals("sofia")) {
                price = 1.20;
                System.out.println(qty * price);
            } else if (town.equals("plovdiv")) {
                price = 1.15;
                System.out.println(qty * price);
            } else if (town.equals("varna")) {
                price = 1.10;
                System.out.println(qty * price);
            }
        }
        if (good.equals("sweets")) {
            if (town.equals("sofia")) {
                price = 1.45;
                System.out.println(qty * price);
            } else if (town.equals("plovdiv")) {
                price = 1.30;
                System.out.println(qty * price);
            } else if (town.equals("varna")) {
                price = 1.35;
                System.out.println(qty * price);
            }
        }
        if (good.equals("peanuts")) {
            if (town.equals("sofia")) {
                price = 1.60;
                System.out.println(qty * price);
            } else if (town.equals("plovdiv")) {
                price = 1.50;
                System.out.println(qty * price);
            } else if (town.equals("varna")) {
                price = 1.55;
                System.out.println(qty * price);
            }
        }
    }
}
