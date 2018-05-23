import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int num=1;
       /* for (int i=0; i<=n;i+=2){ //Optimiziran variant

            System.out.println(num);
            num=num*4;
        }*/

        for (int i=0; i<=n;i++){
if (i%2==0){
    System.out.println(num);
    num=num*4;

}

        }
    }
}
