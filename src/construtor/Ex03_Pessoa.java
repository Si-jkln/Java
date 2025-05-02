package construtor;

public class Ex03_Pessoa {
    String nome;
    int idade;

    public Ex03_Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
