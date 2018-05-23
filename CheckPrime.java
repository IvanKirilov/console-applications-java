import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int result=0;
        int i=2;
        if (n<2){
            System.out.println("Not prime");return;
        }
        while (i<=n/2){
            if (n%i==0){
                result=1;
            }
            i++;
        }
        if (result==1){
            System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }

    }
}

