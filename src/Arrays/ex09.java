package Arrays;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int verifica;
        boolean encontrado = false;

        int[] num = new int[]{
                24, 25, 26, 17, 18, 19, 30
        };

        System.out.println("Digite um número e descubra se ele existe no array");
        verifica = input.nextInt();

        for (int i = 0; i < num.length; i++){
            if (verifica == num[i]){
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            System.out.println("Esse número exite no array");
        }else{
            System.out.println("Esse número não existe no array");
        }
    }
}
