package Arrays;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[4];

        double somaNotas = 0;

        for (int i = 0; i < 4; i++){
            System.out.println("Digite a nota do aluno: " );
            notas[i] = input.nextDouble();


            somaNotas += notas[i];
        }

        double media = somaNotas / 4;

        if (media >= 7 ){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
    }
}
