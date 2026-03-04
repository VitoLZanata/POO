package Xadrez;

public abstract class Peca {
    protected String cor;
    protected Posicao posicao;

    public Peca(String cor, Posicao posicao) {
        this.cor = cor;
        this.posicao = posicao;
    }

    public String getCor() {
        return cor;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}