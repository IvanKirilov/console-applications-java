import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bitcoin=Integer.parseInt(scanner.nextLine());
        double chineseYuan=Double.parseDouble(scanner.nextLine());
        double commission=Double.parseDouble(scanner.nextLine());
        double leva=(bitcoin*1168)+((chineseYuan*0.15)*1.76);
        double eur=leva/1.95;
        double leftEur=eur-((eur*commission)/100);
        System.out.printf("%.2f",leftEur);

    }
}
