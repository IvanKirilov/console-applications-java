import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class ClassRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height and width between 3 and 100 meters!");
        double height = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        if (height < 3 || height > 100 || width < 3 || width > 100) {
            System.out.println("Invalid input!");
            return;
        }
        double rowsOfDesks = Math.floor((height * 100) / 120);
        double numberOfDesksInARow = Math.floor(((width * 100) - 100) / 70);
        double numberOfDesks = ((rowsOfDesks * numberOfDesksInARow) - 3);
        System.out.println(numberOfDesks);

    }

}
