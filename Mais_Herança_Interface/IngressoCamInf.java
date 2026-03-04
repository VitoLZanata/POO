package Mais_Herança_Interface;
// ingresso camarote inferior

public class IngressoCamInf extends IngressoPadrao implements Imprimivel {
    public IngressoCamInf(int valor) {
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
        System.out.println("Localização: " + localizacao);
    }

}
