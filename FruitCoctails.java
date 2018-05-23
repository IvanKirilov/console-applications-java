import java.util.Scanner;

public class FruitCoctails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fruit=scanner.nextLine();
        String size=scanner.nextLine();
        int qty=Integer.parseInt(scanner.nextLine());
        double price=0;
        if (fruit.equals("Watermelon")){
            if (size.equals("small")){
                price=qty*56.00*2;
            }else if (size.equals("big")){
                price=qty*28.70*5;
            }
        }else if (fruit.equals("Mango")){
            if (size.equals("small")){
                price=qty*36.66*2;
            }else if (size.equals("big")){
                price=qty*19.60*5;
            }
        }else if (fruit.equals("Pineapple")){
            if (size.equals("small")){
                price=qty*42.10*2;
            }else if (size.equals("big")){
                price=qty*24.80*5;
            }
        }else if (fruit.equals("Raspberry")){
            if (size.equals("small")){
                price=qty*20.00*2;
            }else if (size.equals("big")){
                price=qty*15.20*5;
            }
        }
        if (price>1000){
            price=price-price*0.50;
        }
        if (price>=400&&price<=1000){
            price=price-price*0.15;
        }
        System.out.printf("%.2f lv.",price);
    }
}
