package Set_Get;

public class Ex01_Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        } else{
            System.out.println("Valor inválido");
        }
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade = quantidade;
        } else{
            System.out.println("Valor inválido");
        }
    }


}
