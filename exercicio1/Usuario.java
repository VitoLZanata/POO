package exercicio1;

import java.util.LinkedList;

public class Usuario {
    private String nome;
    private LinkedList<Perfil> perfis;

    public Usuario() {
        this.perfis = new LinkedList<>();
    }

    public void agregarPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(LinkedList<Perfil> perfis) {
        this.perfis = perfis;
    }

}
