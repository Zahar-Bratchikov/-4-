import java.util.Scanner;
import static java.lang.Math.*;

public class zadanie_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v1, a, anew;
        System.out.println("Введите скорость автомобиля");
        v1 = input.nextDouble();
        System.out.println("Введите угол наклона стекла");
        a = input.nextDouble();
        anew = (a * PI) / 180;
        double v2 = ceil(v1 * tan(anew));
        System.out.println("Скорость капель = " + v2);
    }
}
