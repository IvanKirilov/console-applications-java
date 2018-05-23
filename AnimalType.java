import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String animalName = s.nextLine();
        String animal;
        switch (animalName) {
            case "dog":
                animal = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                animal = "reptile";
                break;
            default:
                animal = "unknown";
                break;

        }
        System.out.println(animal);
    }
}
