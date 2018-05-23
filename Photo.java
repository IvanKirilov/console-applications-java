import java.util.Scanner;

public class Photo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberofPictures=Integer.parseInt(scanner.nextLine());
        String pictuteSize=scanner.nextLine();
        String orderType=scanner.nextLine();
        double price=0;
        if (pictuteSize.equals("9X13")){
            price=numberofPictures*0.16;
            if (numberofPictures>=50){
                price=price-(price*0.05);
            }
        }else if (pictuteSize.equals("10X15")){
            price=numberofPictures*0.16;
            if(numberofPictures>=80){
                price=price-(price*0.03);
            }
        }else if (pictuteSize.equals("13X18")){
            price=numberofPictures*0.38;
            if (numberofPictures>=50&&numberofPictures<=100){
                price=price-(price*0.03);
            }else if (numberofPictures>100){
                price=price-(price*0.05);
            }
        }else if (pictuteSize.equals("20X30")){
            price=numberofPictures*2.90;
            if (numberofPictures>=10&&numberofPictures<=50){
                price=price-(price*0.07);
            }else if (numberofPictures>50){
                price=price-(price*0.09);
            }
        }
        if(orderType.equals("online")){
            price=price-(price*0.02);
        }
        System.out.printf("%.2fBGN",price);

    }
}
