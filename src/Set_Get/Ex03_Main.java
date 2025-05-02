package Set_Get;

import java.util.Scanner;

public class Ex03_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ex03_Cadastro_Ingresso cadastro = new Ex03_Cadastro_Ingresso();

        System.out.println("Qual o nome do evento?");
        String nome = input.nextLine();

        cadastro.setEvento(nome);

        System.out.println("Qual o preço do ingresso?");
        System.out.print("R$");
        double preco = input.nextDouble();

        cadastro.setPreco(preco);

        System.out.println("Quantos ingressos você quer?");
        int quantidade = input.nextInt();

        cadastro.setQuantidade(quantidade);

        if (quantidade > 1){
            double total = cadastro.getQuantidade() * cadastro.getPreco();
            System.out.println("Você pagara R$" + total + " por " + quantidade + " ingressos para o evento " + nome);
        } else {
            System.out.println("Você pagara R$" + preco + " por " + quantidade + " ingressos para o evento " + nome);
        }
    }
}
