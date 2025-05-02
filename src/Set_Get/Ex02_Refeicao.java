package Set_Get;

public class Ex02_Refeicao {
    private String nome;
    private double precoUnitario;
    private int quantidade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidade(double precoUnitario){
        if (precoUnitario > 0){
            this.precoUnitario = precoUnitario;
        } else {
            System.out.println("Por favor digite o valor");
        }
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade = quantidade;
        } else {
            System.out.println("Por favor, digite uma quantidade");;
        }

    }

}
