package Exercises;

import java.util.Scanner;

public class p04VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char input=scanner.nextLine().charAt(0);

        if (input=='a'||input=='e'||input=='o'||input=='u'||input=='e'||input=='i'){
            System.out.println("vowel");
        }else if (input>=48&&input<=57){
            System.out.println("digit");
        }else{
            System.out.println("other");
        }
    }
}
