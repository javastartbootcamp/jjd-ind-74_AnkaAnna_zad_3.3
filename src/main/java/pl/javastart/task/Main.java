package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Math math = new Math();
        int number = 5;
        boolean even = math.isEven(number);
        System.out.println("Czy Liczba " + number + " jest parzysta: " + even);

        int number2 = 3;
        boolean odd = math.isOdd(number2);
        System.out.println("Czy liczba " + number2 + " jest nieparzysta: " + odd);

        double radius = 2.5;
        double circleField = math.circleField(radius);
        System.out.println("Pole koła o promieniu " + radius + " wynosi: " + circleField);

        int number3 = 4;
        int power = math.power(number3);
        System.out.println("Kwadrat liczby " + number3 + " wynosi: "  + power);
    }
}
