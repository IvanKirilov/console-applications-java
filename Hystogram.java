import java.util.Scanner;

public class Hystogram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int counterP1=0;
        int counterP2=0;
        int counterP3=0;
        int counterP4=0;
        int counterP5=0;
        double p1=0;
        double p2=0;
        double p3=0;
        double p4=0;
        double p5=0;
        for (int i=1;i<=n;i++){
            int digit=Integer.parseInt(scanner.nextLine());
            if (digit<200){
                counterP1++;
            }else if (digit>=200&&digit<=399){
                counterP2++;
            }else if (digit>=400&&digit<=599){
                counterP3++;
            }else if (digit>=600&&digit<=799){
                counterP4++;
            }else if (digit>=800){
                counterP5++;
            }
        }
        p1=(counterP1*1.0/n)*100;
        p2=(double)counterP2/n*100;
        p3=(double)counterP3/n*100;
        p4=(double)counterP4/n*100;
        p5=(counterP5*1.00/n)*100;
        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%",p5);

    }
}
