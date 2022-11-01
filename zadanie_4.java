import java.util.Scanner;

public class zadanie_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lstep, kstep, L;
        System.out.println("Укажите свой рост в см: ");
        L = input.nextDouble();
        lstep = (L / 4 + 37) / 100;
        double km, mile, Mmile;
        System.out.println("Укажите кол-во шагов: ");
        kstep = input.nextDouble();
        km = (lstep * kstep) / 1000;
        mile = km / 1.609;
        Mmile = km / 1.862;
        System.out.println("Вы прошли: \n" + km + " км\n" + mile + " миль\n" + Mmile + " морских миль");
    }
}