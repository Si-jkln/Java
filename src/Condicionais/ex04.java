package Condicionais;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual primeira nota do aluno?");
        int n1 = input.nextInt();

        System.out.println("Qual a segunda nota do aluno?");
        int n2 = input.nextInt();

        int media = (n1 + n2)/2;

        if(media >= 7){
            System.out.println("Aprovado");
        } else if(media >= 5 && media < 7){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        /*boa prática: fechar o scanner*/
        input.close();
    }
}
