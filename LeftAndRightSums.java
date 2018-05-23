import java.util.Scanner;

public class LeftAndRightSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int read=2*n;
        for (int i = 0; i < read; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i<n){
                sum1+=num;
            }else{
                sum2+=num;
            }

        }
        if(sum1!=sum2){
            System.out.printf("No, diff= %d", Math.max(sum1,sum2)-Math.min(sum1,sum2));
        }else {
            System.out.println("Yes, sum = "+sum1);
        }
    }
}
