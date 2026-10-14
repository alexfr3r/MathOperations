public class MathOperations {

    public static void main(String[] args) {

        int add1 = add(13, 73);
        System.out.println("Результат сложения: " + add1);

        int sub1 = substract(999, 777);
        System.out.println("Результат вычитания: " + sub1);

        int multi1 = multiply(4, 10);
        System.out.println("Результат произведения " + multi1);

        double div1 = divide(333, 266);
        System.out.println("Результат деления " + div1);

        int max1 = findMax(77,88);
        System.out.println("Наибольшее из чисел: " + max1);

        int diff1 = difference(-300, 700);
        System.out.println("Разница между числами: " + diff1);

        int square1 = squareArena(6);
        System.out.println("Площадь квадрата: " + square1);

        int square2 = squarePerimet(8);
        System.out.println("Периметр квадрата: " + square2);

        double sec2minutes = covertSecondsToMinutes(666);
        System.out.println("Секунды в минуты:" + sec2minutes);

        double avgSpeed1 = avarageSpeed(34.7, 10);
        System.out.println("Avg speed: " + avgSpeed1);

        double avgSpeed2 = avarageSpeed(110, 1);
        System.out.println("Avg speed 2: " + avgSpeed2);

        double Hypotenuse1 = findHypotenuse(2, 4);
        System.out.println("Hypotenuse: " + Hypotenuse1);

        double Hypotenuse2 = findHypotenuse(56.55, 88.77);
        System.out.println("Hypotenuse 2:  " + Hypotenuse2);

        double circle1 = circleCircumference(123.321);
        System.out.println("Radius: " + circle1);

        double circle2 = circleCircumference(1337);
        System.out.println("Radius 2:  " + circle2);

        double percent1 = calculatePercentage(200, 25);
        System.out.println("Percent: " + percent1);

        double cel2far = celsiusToFahrenheit(34);
        System.out.println("Celsius to Fahrenheit: " + cel2far);

        double fah2cel = fahrenheitToCelsius(75);
        System.out.println("Fahrenheit to Celsius: " + fah2cel);

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int z, int q) {
        int w = z - q;
        return w;
    }

    public static int multiply(int r, int t) {
        return r * t;
    }

    public static double divide(int k, int l) {
        return (double) k / l;
    }

    public static int findMax(int s, int d) {
        return Math.max(s,d);
    }

    public static int difference(int f, int g) {
        return Math.abs(f - g);
    }

    public static int squareArena(int side) {
        return side * side;
    }

    public static int squarePerimet(int side) {
        return side * 4;
    }

    public static double covertSecondsToMinutes(int seconds) {
        return (double) seconds / 60.0;
    }

    public static double avarageSpeed(double distance, double time) {
        return (double) distance / (double) time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}

// pull-request