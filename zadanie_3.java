import java.util.Scanner;
import static java.lang.Math.*;


public class zadanie_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("введите переменную a");
        a = input.nextDouble();
        System.out.println("введите переменную b");
        b = input.nextDouble();
        System.out.println("введите переменную c");
        c = input.nextDouble();
        double p = (a + b + c) / 2;
        double S = sqrt(p * (p - a) * (p - b) * (p - c));
        double h = (2 * S) / a;
        double m = sqrt((2 * pow(b, 2) + 2 * pow(c, 2) - pow(a, 2)) / 4);
        System.out.println("высота = " + h);
        System.out.println("медиана = " + m);
    }
}
