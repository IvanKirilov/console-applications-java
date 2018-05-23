import java.util.Scanner;

public class Lutenitsa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double potatoesInKg=Double.parseDouble(scanner.nextLine());
        int boxes=Integer.parseInt(scanner.nextLine());
        int jars=Integer.parseInt(scanner.nextLine());

        double lutenicaInKg=potatoesInKg/5;
        double jarNeeded=(lutenicaInKg/0.535);
        double boxesNeeded=(jarNeeded/jars);

        if (boxesNeeded>boxes){
            double boxesLeft=Math.floor(boxesNeeded-boxes);
            double jarsLeft=Math.floor(jarNeeded-(boxes*jars));
            System.out.printf("Total lutenica: %.0f kilograms.%n",Math.floor(lutenicaInKg));
            System.out.printf("%.0f boxes left.%n",Math.floor(boxesLeft));
            System.out.printf("%.0f jars left.",Math.floor(jarsLeft));

        }else if (boxesNeeded<boxes){
            double boxesLeft=Math.floor(boxes-boxesNeeded);
            double jarsLeft=Math.floor((boxes*jars)-jarNeeded);
            System.out.printf("Total lutenica: %.0f kilograms.%n",Math.floor(lutenicaInKg));
            System.out.printf("%.0f more boxes needed.%n",Math.floor(boxesLeft));
            System.out.printf("%.0f more jars needed.",Math.floor(jarsLeft));
        }
    }
}
