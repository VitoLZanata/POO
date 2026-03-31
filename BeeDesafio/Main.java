import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int x = sc.nextInt();
            ArrayList<Integer> prateleira = new ArrayList<>();

            for (int i = 0; i < x; i++) {
                int inicio = sc.nextInt();
                int fim = sc.nextInt();
                ArrayList<Integer> caixa = new ArrayList<>();
                caixa = Caixa.preencherArray(inicio, fim);
                prateleira.addAll(caixa);
            }
            Collections.sort(prateleira);
            int v = sc.nextInt();
            int r[] = Caixa.procurarPosiValor(prateleira, v);

            if (r[0] == -1) {
                System.out.println(v + " not found");
            } else {
                System.out.println(v + " found from " + r[0] + " to " + r[1]);
            }
        }
    }
}

class Caixa {
    public int inicio;
    public int fim;
    public ArrayList<Integer> caixa;

    static int[] procurarPosiValor(ArrayList<Integer> prateleira, int v) {
        int primeiro = -1;
        int ultimo = -1;

        for (int i = 0; i < prateleira.size(); i++) {
            if (prateleira.get(i) == v) {
                if (primeiro == -1) {
                    primeiro = i;
                }
                ultimo = i;
            }
        }

        return new int[] { primeiro, ultimo };
    }

    public static ArrayList<Integer> preencherArray(int i, int f) {
        ArrayList<Integer> caixa = new ArrayList<>();

        for (int j = i; j <= f; j++) {
            caixa.add(j);
        }

        return caixa;
    }

    public Caixa(ArrayList<Integer> caixa, int fim, int inicio) {
        this.caixa = caixa;
        this.fim = fim;
        this.inicio = inicio;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public ArrayList<Integer> getCaixa() {
        return caixa;
    }

    public void setCaixa(ArrayList<Integer> caixa) {
        this.caixa = caixa;
    }

}