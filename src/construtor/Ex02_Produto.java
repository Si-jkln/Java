package construtor;

public class Ex02_Produto {
    //atributos
    String nome;
    double preco;

    //construtor
    public Ex02_Produto(String nome, double preco){
        this.nome = nome; //inicializa
        this.preco = preco;//inicializa
    }

    //metodo
    public void mostrarProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
