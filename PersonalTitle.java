import java.util.Scanner;

public class PersonalTitle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double age =Double.parseDouble(scanner.nextLine());
        char gender=scanner.nextLine().charAt(0);
        if (age<16){
            if ('m'==gender){
                System.out.println("Master");
            }else if ('f'==gender){
                System.out.println("Miss");
            }
        }else{
            if(age>=16){
                if ('m'==gender){
                    System.out.println("Mr.");
                }else if('f'==gender){
                    System.out.println("Ms.");
                }

            }
        }

    }
}
