import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.next();
        int qtd1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        Obj x = new Obj(qtd1, valor1);

        sc.next();
        int qtd2 = sc.nextInt();
        double valor2 = sc.nextDouble();
        Obj y = new Obj(qtd2, valor2);

        double total = (x.getQtd() * x.getValor()) + (y.getQtd() * y.getValor());

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        
    }
}

class Obj {
    private int qtd;
    private double valor;

    public Obj(int qtd, double valor) {
        this.qtd = qtd;
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public double getValor() {
        return valor;
    }
}