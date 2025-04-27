package Condicionais;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual operação você deseja realizar?");
        char operador = input.next().charAt(0);

        System.out.println("Agora digite o número você deseja realizar a operação");
        System.out.print("Número 1:");
        int n1 = input.nextInt();
        System.out.print("Número 2:");
        int n2 = input.nextInt();

        if(operador == '+'){
            int soma = n1 + n2;
            System.out.println("A soma entre: " + n1 + " e " + n2 + " é igual a: " + soma);
        } else if(operador == '-'){
            int subtracao = n1 - n2;
            System.out.println("A subtração entre: " + n1 + " e " + n2 + " é igual a: " + subtracao);
        } else if(operador == '*'){
            int multiplicacao = n1 * n2;
            System.out.println("A multiplicação entre: " + n1 + " e " + n2 + " é igual a: " + multiplicacao);
        } else if(operador == '/'){
            if (n2 != 0){
                int divisao = n1 / n2;
                System.out.println("A divisão entre: " + n1 + " e " + n2 + " é igual a: " + divisao);
            } else {
                System.out.println("Erro: divisão por zero não é permitida.");
            }

        } else{
            System.out.println("Operador invalido");
        }

        input.close();
    }
}
