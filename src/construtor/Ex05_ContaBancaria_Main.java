package construtor;

import java.util.Scanner;

public class Ex05_ContaBancaria_Main {
    public static void main(String[] args) {
        Ex05_ContaBancaria conta = new Ex05_ContaBancaria("Ellena", 5000);

        Scanner input = new Scanner(System.in);

        int opcao = 4;

        while (true){

            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Depositar");
            System.out.println("1 - Sacar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("4 - Sair");

            opcao = input.nextInt();

            if(opcao == 1){
                conta.deposito();
            } else if (opcao == 2){
                conta.sacar();
            } else if (opcao == 3) {
                conta.mostrar();
            } else if(opcao == 4) {
                break;
            } else{
                System.out.println("Opção inválida");
            }
        }

    }
}
