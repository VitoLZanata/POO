import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex3 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int x = sc.nextInt();
            
            // Criamos o objeto que vai gerenciar a lista de telefones
            ListaTelefonica lista = new ListaTelefonica();
            
            for (int i = 0; i < x; i++) {
                String num = sc.next();
                lista.adicionar(num);
            }

            // Chamamos o método que faz a lógica da economia
            System.out.println(lista.calcularEconomiaTotal());
        }
    }
}

class ListaTelefonica {
    private ArrayList<String> telefones;

    public ListaTelefonica() {
        this.telefones = new ArrayList<>();
    }

    public void adicionar(String tel) {
        this.telefones.add(tel);
    }

    public int calcularEconomiaTotal() {
        Collections.sort(this.telefones);

        int economia = 0;
        
        for (int i = 1; i < telefones.size(); i++) {
            economia += compararPrefixos(telefones.get(i - 1), telefones.get(i));
        }

        return economia;
    }

    private int compararPrefixos(String anterior, String atual) {
        int iguais = 0;
        for (int j = 0; j < anterior.length(); j++) {
            if (anterior.charAt(j) == atual.charAt(j)) {
                iguais++;
            } else {
                break; 
            }
        }
        return iguais;
    }
}