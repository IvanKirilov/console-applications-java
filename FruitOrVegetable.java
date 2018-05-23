import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine().toLowerCase();
        boolean isFruit=name.equals("banana")||
                name.equals("apple")||
                name.equals("kiwi")||
                name.equals("cherry")||
                name.equals("lemon")||
                name.equals("grapes");
        boolean isVegetable = name.equals("tomato") || name.equals("cucumber") || name.equals("pepper") || name.equals("carrot");
        if (isFruit) {
            System.out.println("fruit");
        } else if (isVegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
