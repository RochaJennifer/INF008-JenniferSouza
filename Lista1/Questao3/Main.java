package Lista1.Questao3;

public class Main {
    public static void main(String[] args) {

        GeometryCalculator calc1 = new GeometryCalculator();
        GeometryCalculator calc2 = new GeometryCalculator(4);
        GeometryCalculator calc3 = new GeometryCalculator(true);

        System.out.println("Área do círculo: " + calc1.calculateArea(3));
        System.out.println("Área do retângulo: " + calc1.calculateArea(5, 4));
        System.out.println("Área do triângulo (Heron): " + calc1.calculateArea(3, 4, 5));

        System.out.println("Perímetro do triângulo: " + calc1.calculatePerimeter(3, 4, 5));
        System.out.println("Perímetro do quadrado: " + calc2.calculatePerimeter(6, 6, 6, 6));

        System.out.println("Área com calc3: " + calc3.calculateArea(7));
    }
}

