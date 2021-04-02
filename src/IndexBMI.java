import java.util.Scanner;

public class IndexBMI {
    public static void main(String[] args) {
        double weigth , heigth , bmi;
        Scanner GetNumber = new Scanner(System.in);
        System.out.println("Weigth: ");
        weigth = GetNumber.nextDouble();
        System.out.println("Height: ");
        heigth = GetNumber.nextDouble();
        bmi = weigth/Math.pow(heigth,2);
        System.out.println(bmi);
        if ( bmi < 18.5){
            System.out.println("Underweight");
        }else
            if ( bmi < 25.0){
                System.out.println("nomal");
            }else
                if (bmi < 30){
                    System.out.println("overweight");
                }else {
                    System.out.println("obese");
                    }

    }
}
