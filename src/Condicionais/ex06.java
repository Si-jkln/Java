package Condicionais;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Descubra se o número é multiplo de 3, 5 ou ambos");
        System.out.print("Digite um número: ");
        int n1 = input.nextInt();

        /*Verifica se o número é positivo ou não*/
        if (n1 < 0){
            System.out.println("Insira um número positivo");
        } else{
            if(n1 % 3 == 0 && n1 % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (n1 % 3 == 0 && n1 % 5 != 0){
                System.out.println("Fizz");
            } else if (n1 % 3 != 0 && n1 % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n1);
            }
        }
        input.close();
    }
}
