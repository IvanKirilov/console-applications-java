import java.util.Scanner;

public class p02BooleanVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        if (str.equals("True")){
            System.out.println("Yes");
        }else if (str.equals("False")){
            System.out.println("No");
        }
    }
}
