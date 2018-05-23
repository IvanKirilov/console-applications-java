import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double age=Double.parseDouble(sc.nextLine());
        char gender=sc.nextLine().charAt(0);
        if('f'==gender){
            if(age<16){
                System.out.println("Miss");
            }else{
                System.out.println("Ms.");

            }
        }else{
            if(age<16){
                System.out.println("Master");
            }else{
                System.out.println("Mr.");
            }
        }
    }
}
