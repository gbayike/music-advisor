import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
    }
}

sealed abstract class Shape permits Square {
    abstract double getArea();
}

final class Square extends Shape{

    private final double length;

    public Square(double length){
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }
}