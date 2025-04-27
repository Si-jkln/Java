package Arrays;

public class ex02 {
    public static void main(String[] args) {
        int[] numeros = new int[]{
                1, 4, 7, 2, 5, 8, 3, 6, 9, 8
        };

        int aux = 0;

        for( int i = 1; i <= 9; i++){ /*no lugar de i <= 9 podemos usar o .length que le o tamanho do array e pode ser usado em arrays de qualquer tamanho*/
            if(numeros[i] > aux){
                aux = numeros[i];

            }

        }
        System.out.println("O maior número é: " + aux);
    }
}
