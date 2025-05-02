package Set_Get;

import java.util.Scanner;

public class Ex01_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ex01_Produto produto = new Ex01_Produto();

        System.out.println("Qual o nome do produto?");
        String nome = input.nextLine();

        produto.setNome(nome);

        System.out.println("Qual o preço do produto?");
        System.out.print("R$");
        double preco = input.nextDouble();

        produto.setPreco(preco);

        System.out.println("Qual a quantidade?");
        int quantidade = input.nextInt();

        produto.setQuantidade(quantidade);

        if (quantidade > 1){
            double valorPagar = produto.getQuantidade() * produto.getPreco();
            System.out.println("Você pagara R$" + valorPagar + " em " + quantidade + " de " + nome);
        } else{
            System.out.println("Você pagara R$" + preco + " em " + quantidade + " de " + nome);
        }
    }
}
