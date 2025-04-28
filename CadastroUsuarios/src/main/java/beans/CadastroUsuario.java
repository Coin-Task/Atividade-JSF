import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();
        
        Usuario novoUsuario = new Usuario(nome);
        usuarios.add(novoUsuario);

        System.out.println("\nUsuário(s) cadastrados:");
        for (Usuario u : usuarios) {
            System.out.println("- " + u.getNome());
        }

        scanner.close();
    }
}

class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
