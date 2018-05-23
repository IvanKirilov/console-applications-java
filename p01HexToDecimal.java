package Exercises;

import java.util.Scanner;

public class p01HexToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int num=Integer.parseInt(str,16);

        System.out.println(num);

    }
}
