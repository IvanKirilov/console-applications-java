import java.util.Scanner;

public class MoneyPrize {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int projectParts=Integer.parseInt(scanner.nextLine());
        double projectPrizePerPart = Double.parseDouble(scanner.nextLine());
        int sum=0;
        double moneyPrize=0;
        for (int i=1;i<=projectParts;i++){
            int score=Integer.parseInt(scanner.nextLine());
            if (i%2==0){
                sum=sum+score*2;
            }else{
                sum=sum+score;
            }
        }
        moneyPrize=projectPrizePerPart*sum;
        System.out.printf("The project prize was %.2f lv.",moneyPrize);
    }
}
