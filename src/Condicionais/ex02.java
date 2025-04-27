package Condicionais;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = input.nextInt();

        if (idade < 18){
            System.out.println("Você ainda menor de idade");
        } else{
            System.out.println("Você já é maior de idade");
        }
    }
}
