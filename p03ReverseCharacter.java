package Exercises;

import java.util.Scanner;

public class p03ReverseCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char char1=sc.nextLine().charAt(0);
        char char2=sc.nextLine().charAt(0);
        char char3=sc.nextLine().charAt(0);

        char[]myArr={char1,char2,char3};
        for (int i=myArr.length-1;i>=0;i--){
            System.out.print(myArr[i]);
        }
    }
}
