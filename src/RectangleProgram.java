import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner getit = new Scanner(System.in);

        System.out.println("width enter: ");
        width = getit.nextFloat();

        System.out.println("width enter: ");
        heigth = getit.nextFloat();

        float area = width * heigth;
        System.out.println("area = " + area);
    }
}
