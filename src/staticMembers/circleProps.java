package staticMembers;

import staticMembers.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

/*Classe com membros estáticos na classe util.Calculator*/

public class circleProps {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("The circumference is: %.2f%n", c);
        System.out.printf("The volume is: %.2f%n", v);
        System.out.printf("The pi is: %.2f%n", Calculator.PI_VALUE);
    }
}