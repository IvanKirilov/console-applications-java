import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());
        int l = Integer.parseInt(keyboard.nextLine());
        int a = 1;
        while (a < n) {

            int b = 1;
            while (b < n) {
                a++;
                char c = 'a';
                while (c < 'a' + l) {
                    b++;
                    char d = 'a';
                    while (d < 'a' + l) {
                        c++;
                        int e = 1;
                        while (e <= n) {
                            d++;
                            if (e > a && e > b) {
                                a++;
                                System.out.print(a + "" + b + "" + c + "" + d + "" + e + " ");
                            }
                        }
                    }
                }
            }

        }

    }

}