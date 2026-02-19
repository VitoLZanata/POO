package exercicio1;

import java.util.LinkedList;

public class Perfil {
    private String nome;
    private Usuario usuario;
    private LinkedList<Conteudo> conteudosAssistidos;

    public Perfil(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.conteudosAssistidos = new LinkedList<>();
        usuario.agregarPerfil(this);
    }

    public LinkedList<Conteudo> getConteudosAssistidos() {
        return conteudosAssistidos;
    }

    public void assistirConteudo(Conteudo conteudo) {
        conteudosAssistidos.add(conteudo);
    }

    public String getNome() {
        return nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}