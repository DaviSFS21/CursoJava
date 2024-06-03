package staticMembers.util;

public class Calculator {
    public static final double PI_VALUE = 3.14;

    public static double circumference(double radius) {
        return 2.0 * PI_VALUE * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI_VALUE * radius * radius * radius / 3.0;
    }
}
