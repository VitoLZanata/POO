package exercicio1;

public class Conteudo {
    private String titulo;
    private String diretor;
    private String elenco;

    public Conteudo(String titulo, String diretor, String elenco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getElenco() {
        return elenco;
    }
}
