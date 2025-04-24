package Arrays;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somador = 0;

        for (int n = 1; n <= 5; n++) {
            System.out.println("Digite um número");
            int numero = input.nextInt();

            somador = somador + numero;

        }
        System.out.println("Soma dos números digitados " + somador);
        input.close();
    }
}
