import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();


        Vendedor v = new Vendedor(nome, salarioFixo, totalVendas);


        double totalParaReceber = v.getSalarioFixo() + (v.getTotalVendas() * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalParaReceber);

        sc.close();
    }
}

class Vendedor {
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    public Vendedor(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}