import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        int rate = 23000;
        int vnd;
        int usa;
        Scanner scan = new Scanner(System.in);
        System.out.print(" mời bạn nhập số tiền đô muốn đổi: ");
        usa = scan.nextInt();
        vnd = rate * usa;
        System.out.print(usa + " usa = " +vnd);

    }
}
