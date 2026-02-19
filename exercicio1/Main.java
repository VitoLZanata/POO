package exercicio1;
import java.util.Scanner;

/*Problema 1 – Plataforma de Streaming Uma empresa está criando um sistema
semelhante à Netflix.
O sistema deve permitir que usuários criarem perfis onde cada perfil pode assistir filmes e séries. 
Cada filme possui elenco e diretor. 
Um usuário pode ter vários perfis e perfis podem assistir vários conteúdos. 
O sistema deve permitir consultar:

Perfis de um usuário.
Conteúdos assistidos por um perfil.
Elenco de um filme. 

*/

public class Main {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Usuario user = new Usuario("João");
        Perfil perfil1 = new Perfil("Perfil 1", user);
        Perfil perfil2 = new Perfil("Perfil 2", user);

        perfil1.assistirConteudo(new Conteudo("Filme 1", "Diretor 1", "Elenco 1"));
        perfil1.assistirConteudo(new Conteudo("Série 1", "Diretor 2", "Elenco 2"));
        perfil2.assistirConteudo(new Conteudo("Filme 2", "Diretor 3", "Elenco 3"));

        System.out.println("Perfis do usuário " + user.getNome() + ":");
        for (Perfil perfil : user.getPerfis()) {
            System.out.println("- " + perfil.getNome());
        }

        System.out.println("\nConteúdos assistidos pelo " + perfil1.getNome() + ":");
        for (Conteudo conteudo : perfil1.getConteudosAssistidos()) {
            System.out.println("- " + conteudo.getTitulo());
        }
    }
}   