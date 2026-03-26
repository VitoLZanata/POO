import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        Viagem v = new Viagem(tempo, velocidade);

        double distancia = v.getTempo() * v.getVelocidade();
        double litrosNecessarios = distancia / 12.0;

        System.out.printf("%.3f%n", litrosNecessarios);

        sc.close();
    }
}

class Viagem {
    private int tempo;
    private int velocidade;

    public Viagem(int tempo, int velocidade) {
        this.tempo = tempo;
        this.velocidade = velocidade;
    }

    public int getTempo() { return tempo; }
    public int getVelocidade() { return velocidade; }
}