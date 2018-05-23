import java.util.Scanner;

public class KindOfTransport {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int distance=Integer.parseInt(scanner.nextLine());
        double transportPrice;
       /* if (distance<1||distance>5000){
            System.out.println("Error!");
            return;
        }*/
        String time=scanner.nextLine().toLowerCase();
        if (time.equals("day")){
            if (distance<20){
                transportPrice=(0.70+distance*0.79);
                System.out.printf("%.02f",transportPrice);
            }else if (distance>=20&&distance<100){
                transportPrice=distance*0.09;
                System.out.printf("%.02f",transportPrice);
            }else {
                transportPrice=distance*0.06;
                System.out.printf("%.02f",transportPrice);
            }
        }
        if (time.equals("night")){
            if (distance<20){
                transportPrice=(0.70+distance*0.90);
                System.out.printf("%.02f",transportPrice);
            }else if (distance>=20&&distance<100){
                transportPrice=distance*0.09;
                System.out.printf("%.02f",transportPrice);
            }else {
                transportPrice=distance*0.06;
                System.out.printf("%.02f",transportPrice);
            }
        }
    }
}
