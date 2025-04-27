package Condicionais;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = input.nextInt();

        if(num >= 0){
            System.out.println("Este número é positivo");
        } else{
            System.out.println("Este número é negativo");
        }
    }
}
