package Mais_Herança_Interface;

public class Main {
    public static void main(String[] args) {

        // ==============================
        // Ingresso Padrão
        // ==============================
        IngressoPadrao padrao = new IngressoPadrao(100);
        padrao.setValor(100);

        System.out.println("=== INGRESSO PADRÃO ===");
        System.out.println("Valor: " + padrao.getValor());
        System.out.println();


        // ==============================
        // Ingresso VIP
        // ==============================
        IngressoVIP vip = new IngressoVIP(100);
        vip.setValor(100);
        vip.setValorAdicional(50);
        vip.setValorTotal(vip.calcularValorTotal()); // recalcula corretamente

        System.out.println("=== INGRESSO VIP ===");
        System.out.println("Valor base: " + vip.getValor());
        System.out.println("Valor adicional: " + vip.getValorAdicional());
        System.out.println("Valor total: " + vip.getValorTotal());
        System.out.println();


        // ==============================
        // Camarote Inferior
        // ==============================
        IngressoCamInf camInf = new IngressoCamInf(100);
        camInf.setValor(150);
        camInf.setLocalizacao("Setor A - Fileira 1");

        System.out.println("=== CAMAROTE INFERIOR ===");
        System.out.println("Valor: " + camInf.getValor());
        camInf.imprimir(); // imprime localização
        System.out.println();


        // ==============================
        // Camarote VIP
        // ==============================
        IngressoCamVIP camVIP = new IngressoCamVIP(100);
        camVIP.setValor(200);
        camVIP.setValorAdicional(80);
        camVIP.setValorTotal(camVIP.calcularValorTotal());
        camVIP.setLocalizacao("Área VIP - Frente ao palco");

        System.out.println("=== CAMAROTE VIP ===");
        System.out.println("Valor base: " + camVIP.getValor());
        System.out.println("Valor adicional: " + camVIP.getValorAdicional());
        camVIP.imprimir(); // imprime valor total + localização
    }
}