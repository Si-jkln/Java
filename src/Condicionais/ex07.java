package Condicionais;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Descubra qual o triângulo:");
        System.out.print("Insira o primeiro lado:");
        int l1 = input.nextInt();
        System.out.print("Insira o segundo lado:");
        int l2 = input.nextInt();
        System.out.print("Insira o terceiro lado:");
        int l3 = input.nextInt();

        if(l1 == l2 && l2 == l3 && l3 == l1){
            System.out.println("Triângulo Equilátero");
        } else if(l1 == l2 || l2 == l3 || l3 == l1){
            System.out.println("Triângulo Isósceles");
        }else {
            System.out.println("Triângulo Escaleno");
        }
    }
}
