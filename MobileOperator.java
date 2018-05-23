import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String termOfContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String plusInternet = scanner.nextLine();
        int numberOfMonths = Integer.parseInt(scanner.nextLine());
        double periodPrice;
        double basicMonthprice;
        if(termOfContract.equals("one")&&typeOfContract.equals("Small")){
            basicMonthprice=9.98;
            if (plusInternet.equals("yes")){
                periodPrice=(basicMonthprice+5.50)*numberOfMonths;
            }else {
                periodPrice=basicMonthprice*numberOfMonths;
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
        if(termOfContract.equals("one")&&typeOfContract.equals("Middle")){
            basicMonthprice=18.99;
            if (plusInternet.equals("yes")){
                periodPrice=(basicMonthprice+4.35)*numberOfMonths;
            }else {
                periodPrice=basicMonthprice*numberOfMonths;
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
        if(termOfContract.equals("one")&&typeOfContract.equals("Large")){
            basicMonthprice=25.98;
            if (plusInternet.equals("yes")){
                periodPrice=(basicMonthprice+4.35)*numberOfMonths;
            }else {
                periodPrice=basicMonthprice*numberOfMonths;
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
        if(termOfContract.equals("one")&&typeOfContract.equals("ExtraLarge")){
            basicMonthprice=35.99;
            if (plusInternet.equals("yes")){
                periodPrice=(basicMonthprice+3.85)*numberOfMonths;
            }else {
                periodPrice=basicMonthprice*numberOfMonths;
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
        if(termOfContract.equals("two")&&typeOfContract.equals("Small")){
            basicMonthprice=8.58;
            if (plusInternet.equals("yes")){
                periodPrice=((basicMonthprice+5.50)*numberOfMonths-(basicMonthprice+5.50)*numberOfMonths*0.0375);
            }else {
                periodPrice=(basicMonthprice*numberOfMonths)-basicMonthprice*numberOfMonths*0.0375;
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
        if(termOfContract.equals("two")&&typeOfContract.equals("Middle")){
            basicMonthprice=17.09;
            if (plusInternet.equals("yes")){
                periodPrice=((basicMonthprice+4.35)*numberOfMonths-(basicMonthprice+4.35)*numberOfMonths*0.0375);
            }else {
                periodPrice=(basicMonthprice*numberOfMonths)-(basicMonthprice*numberOfMonths*0.0375);
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
        if(termOfContract.equals("two")&&typeOfContract.equals("Large")){
            basicMonthprice=23.59;
            if (plusInternet.equals("yes")){
                periodPrice=((basicMonthprice+4.35)*numberOfMonths-(basicMonthprice+4.35)*numberOfMonths*0.0375);
            }else {
                periodPrice=(basicMonthprice*numberOfMonths)-basicMonthprice*numberOfMonths*0.0375;
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
        if(termOfContract.equals("two")&&typeOfContract.equals("ExtraLarge")){
            basicMonthprice=31.79;
            if (plusInternet.equals("yes")){
                periodPrice=((basicMonthprice+3.85)*numberOfMonths-(basicMonthprice+3.85)*numberOfMonths*0.0375);
            }else {
                periodPrice=(basicMonthprice*numberOfMonths)-basicMonthprice*numberOfMonths*0.0375;
            }
            System.out.printf("%.2f lv.",periodPrice);
        }
    }
}



