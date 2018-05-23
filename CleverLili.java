import java.util.Scanner;

public class CleverLili {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=Integer.parseInt(scanner.nextLine());
        double washingMashinePrice =Double.parseDouble(scanner.nextLine());
        int pricePerToy=Integer.parseInt(scanner.nextLine());
        int toyCounter=0;
        int moneyCounter=0;
        int moneySum=0;
        int sum=0;
       for(int i=1;i<=age;i++){
           if (i%2!=0){
               toyCounter++;
           }else{
               moneyCounter++;
               moneySum+=10;
               sum+=moneySum;
           }
       }
        int savedMoney=sum+(toyCounter*pricePerToy)-moneyCounter;
        if (savedMoney>=washingMashinePrice){
            System.out.printf("Yes! %.2f",(savedMoney-washingMashinePrice));
        }else{
            System.out.printf("No! %.2f",(washingMashinePrice-savedMoney));
        }


    }
}
