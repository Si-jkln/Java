package construtor;

import java.util.Scanner;

public class Ex05_ContaBancaria {
    String titular;
    double saldo;


    Scanner input = new Scanner(System.in);

    public Ex05_ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito (){
        System.out.println("Quanto você deseja depositar? ");
        double entrada = input.nextDouble();
        saldo += entrada;
    }

    public void sacar(){
        System.out.println("Qual valor você deseja sacar?");
        double saida = input.nextDouble();
        if (saldo >= saida){
            saldo -= saida;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void mostrar(){
        System.out.println("Nome do titular:" + titular);
        System.out.println("Saldo da conta: R$" + saldo);

    }
}
