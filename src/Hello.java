import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner GetName = new Scanner(System.in);
        System.out.println("mời bạn nhập tên: ");
        name = GetName.nextLine();
        System.out.println( "Hello "+ name );
    }
}
