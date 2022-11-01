import java.util.Scanner;

import static java.lang.Math.*;


public class zadanie_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double xa, ya, xb, yb, xc, yc, x_pr, y_pr;
        System.out.println("введите x координату точки А");
        xa = input.nextDouble();
        System.out.println("введите y координату точки А");
        ya = input.nextDouble();
        System.out.println("введите x координату точки B");
        xb = input.nextDouble();
        System.out.println("введите y координату точки B");
        yb = input.nextDouble();
        System.out.println("введите x координату точки C");
        xc = input.nextDouble();
        System.out.println("введите y координату точки C");
        yc = input.nextDouble();
        x_pr = ProjectionX(xa, ya, xb, yb, xc, yc);
        y_pr = ProjectionY(xa, ya, xb, yb, xc, yc);
        System.out.println("Проекция точки С на прямую:");
        System.out.println(x_pr);
        System.out.println(y_pr);
    }

    public static double ProjectionX(double xa, double ya, double xb, double yb, double xc, double yc) {
        double m = (xb - xa);
        double p = (yb - ya);
        double t = ((m * (xc - xa)) + (p * (yc - ya))) / ((pow(m, 2) + pow(p, 2)));
        return ((m * t) + xa);
    }

    public static double ProjectionY(double xa, double ya, double xb, double yb, double xc, double yc) {
        double m = (xb - xa);
        double p = (yb - ya);
        double t = ((m * (xc - xa)) + (p * (yc - ya))) / ((pow(m, 2) + pow(p, 2)));
        return ((p * t) + ya);
    }
}
