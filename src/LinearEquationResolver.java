import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner getit = new Scanner(System.in);
        System.out.println("a : ");
        a = getit.nextDouble();
        System.out.println("b : ");
        b = getit.nextDouble();
        System.out.println("c : ");
        c = getit.nextDouble();
        if ( a != 0){
            double x = (c-b)/a;
            System.out.println(" nghiệm duy nhất" + x);
        }else
            if (b == 0 ){
                System.out.println("vô số nghiệm");
            }else {
                System.out.println("pt vô nghiệm");
            }
    }
}
