import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner getyear = new Scanner(System.in);
        System.out.println("year : ");
        int year = getyear.nextInt();
        if ( year % 4 == 0){
            if ( year % 100 == 0){
                if ( year % 400 == 0){
                    System.out.println("năm "+year+" là năm nhuận");
                }else {
                    System.out.println("năm "+year+" không là năm nhuận");
                }
            }else{
                System.out.println("năm "+year+" là năm nhuận");
            }

        }else {
            System.out.println("năm "+year+" không là năm nhuận");
        }
    }


}

