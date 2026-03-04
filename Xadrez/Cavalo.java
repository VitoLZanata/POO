package Xadrez;

public class Cavalo extends Peca implements Movimentavel {

    public Cavalo(String cor, Posicao posicao) {
        super(cor, posicao);
    }

    @Override
    public void mover(Posicao origem, Posicao destino) {
        int diferencaLinha = Math.abs(destino.getLinha() - origem.getLinha());
        int diferencaColuna = Math.abs(destino.getColuna() - origem.getColuna());

        if ((diferencaLinha == 2 && diferencaColuna == 1) ||
            (diferencaLinha == 1 && diferencaColuna == 2)) {
            
            setPosicao(destino);
            System.out.println("Cavalo moveu em L!");
        } else {
            System.out.println("Movimento inválido para o Cavalo!");
        }
    }
}