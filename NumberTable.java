import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int row=0; row<n;row++){
            for (int column=0;column<n;column++){
                int num=row+column+1;
                if (num>n){
                    num=2*n-num;
                }
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
