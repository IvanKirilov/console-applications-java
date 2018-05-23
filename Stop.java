import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int rows=(n*2)+2;
        //String firstRow=repeatString(".",n+1)+repeatString("_",);
    }
    public static String repeatString(String str, int count){
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=count;i++){
            sb.append(str);
        }
        return sb.toString();
    }
}
