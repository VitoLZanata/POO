import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int id = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();

        Funcionario f = new Funcionario(id, valorHora, horas);

        System.out.printf("NUMBER = %d%n", f.getNum());
        
        double salariofinal = f.getHoras() * f.getSalario();
        System.out.printf("SALARY = U$ %.2f%n", salariofinal);
        
        sc.close();
    }
}

class Funcionario {
    private int num;
    private double salario;
    private int horas;

    public Funcionario(int num, double salario, int horas) {
        this.num = num;
        this.salario = salario;
        this.horas = horas;
    }

    public int getNum() {
        return num;
    }

    public double getSalario() {
        return salario;
    }

    public int getHoras() {
        return horas;
    }
}