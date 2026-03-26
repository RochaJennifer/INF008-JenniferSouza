package Lista1.Questao3;

public class GeometryCalculator {

    private int precision;

    public GeometryCalculator() {
        this.precision = 2;
    }

    public GeometryCalculator(int precision) {
        this.precision = precision;
    }

    public GeometryCalculator(boolean useDefaultPrecision) {
        this(2);
    }

    private double roundValue(double value) {
        double factor = Math.pow(10, precision);
        return Math.round(value * factor) / factor;
    }

    public double calculateArea(double radius) {
        return roundValue(Math.PI * radius * radius);
    }

    public double calculateArea(double base, double height) {
        return roundValue(base * height);
    }

    public double calculateArea(double side1, double side2, double side3) {
        if (!isValidTriangle(side1, side2, side3)) {
            System.out.println("Triângulo inválido.");
            return 0.0;
        }

        double semiPerimeter = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(
            semiPerimeter *
            (semiPerimeter - side1) *
            (semiPerimeter - side2) *
            (semiPerimeter - side3)
        );

        return roundValue(area);
    }

    public double calculatePerimeter(double... sides) {
        if (sides == null || sides.length == 0) {
            System.out.println("Nenhum lado foi informado.");
            return 0.0;
        }

        double sum = 0.0;

        for (double side : sides) {
            if (side <= 0) {
                System.out.println("Os lados devem ser positivos.");
                return 0.0;
            }
            sum += side;
        }

        return roundValue(sum);
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 > 0 && side2 > 0 && side3 > 0 &&
               side1 + side2 > side3 &&
               side1 + side3 > side2 &&
               side2 + side3 > side1;
    }
}