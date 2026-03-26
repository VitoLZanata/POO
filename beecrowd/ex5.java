import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ponto p1 = new Ponto(sc.nextDouble(), sc.nextDouble());
        Ponto p2 = new Ponto(sc.nextDouble(), sc.nextDouble());

        double distancia = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));

        System.out.printf("%.4f%n", distancia);

        sc.close();
    }
}

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}