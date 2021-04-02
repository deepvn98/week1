import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        int month;
        Scanner getnumber = new Scanner(System.in);
        System.out.println("nhập tháng bạn muốn kiểm tra :" );
        month = getnumber.nextInt();
        switch (month){
            case 1:
                System.out.println("Tháng "+ month+" có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng "+ month+" có 28 ngày");
                break;
            case 3:
                System.out.println("Tháng "+ month+" có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng "+ month+" có 30 ngày");
                break;
            case 5:
                System.out.println("Tháng "+ month+" có 31 ngày");
                break;
            case 6:
                System.out.println("Tháng "+ month+" có 30 ngày");
                break;
            case 7:
                System.out.println("Tháng "+ month+" có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng "+ month+" có 31 ngày");
                break;
            case 9:
                System.out.println("Tháng "+ month+" có 30 ngày");
                break;
            case 10:
                System.out.println("Tháng "+ month+" có 31 ngày");
                break;
            case 11:
                System.out.println("Tháng "+ month+" có 30 ngày");
                break;
            case 12:
                System.out.println("Tháng "+ month+" có 31 ngày");
                break;
            default:
        }

    }
}
