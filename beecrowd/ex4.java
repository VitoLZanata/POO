import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        double combustivel = sc.nextDouble();

        Carro c = new Carro(distancia, combustivel);

        double consumoMedio = c.getDistancia() / c.getCombustivel();

        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}

class Carro {
    private int distancia;
    private double combustivel;

    public Carro(int distancia, double combustivel) {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }

    public int getDistancia() {
        return distancia;
    }

    public double getCombustivel() {
        return combustivel;
    }
}