import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number=Integer.parseInt(input.nextLine());
        int i,j,counter=1;
        for (i=0;i<number;i++){
            for (j=0;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
                if (counter>number){
                    return;
                }
            }
            System.out.println();

        }

    }
}
