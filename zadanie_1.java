import java.util.Scanner;
import static java.lang.Math.*;

public class zadanie_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double u, y;
        System.out.println("введите переменную u");
        u = input.nextDouble();
        System.out.println("введите переменную y");
        y = input.nextDouble();
        double T = (sin(2 * u)) / (log(2 * y + u));
        System.out.println("Ответ:" + T);
    }
    static {
        double a, b, x, z;
        Scanner input = new Scanner(System.in);
        System.out.println("введите переменную a");
        a = input.nextDouble();
        System.out.println("введите переменную b");
        b = input.nextDouble();
        System.out.println("введите переменную x");
        x = input.nextDouble();
        System.out.println("введите переменную z");
        z = input.nextDouble();
        double F = (sqrt(abs(x) + pow(cos(x), 3) + pow(z, 4))) / (log(x) - asin(b * x - a));
        if ((b * x - a) >= 1 || (b * x - a) <= -1) {
            System.out.println("Неверные данные");
        } else {
            System.out.println("Ответ:" + F);
        }
    }
}
