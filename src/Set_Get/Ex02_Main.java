package Set_Get;

import java.util.Scanner;

public class Ex02_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ex02_Refeicao refeicao = new Ex02_Refeicao();

        System.out.println("Qual a refeição?");
        String nome = input.nextLine();

        refeicao.setNome(nome);

        System.out.println("Qual o valor da unidade?");
        System.out.print("R$");
        double precoUnitario = input.nextDouble();

       refeicao.setPrecoUnitario(precoUnitario);

        System.out.println("Qual a quantidade você deseja?");
        int quantidade = input.nextInt();

        refeicao.setQuantidade(quantidade);

        if(quantidade > 1){
            double pagar = refeicao.getQuantidade() * refeicao.getPrecoUnitario();
            System.out.println("Você pagara R$" + pagar + " por " + quantidade + " de " + nome);
        } else {
            System.out.println("Você pagara R$" + precoUnitario+ " por " + quantidade + " de " + nome);
        }
    }
}
