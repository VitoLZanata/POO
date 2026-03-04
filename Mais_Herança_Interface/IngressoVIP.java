package Mais_Herança_Interface;

public class IngressoVIP extends IngressoPadrao {
    
        public IngressoVIP(float valor) {
            super(valor);
    }

    public int valorAdicional;
    public float valorTotal = calcularValorTotal();

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(int valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int calcularValorTotal() {
        return (int) (getValor() + valorAdicional);
    }

}
