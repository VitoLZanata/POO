package Mais_Herança_Interface;

public class IngressoCamVIP extends IngressoVIP implements Imprimivel {
    public IngressoCamVIP(int valor) {
        super(valor);
    }

    public String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public void imprimir() {
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Localização: " + localizacao);
    }

}
