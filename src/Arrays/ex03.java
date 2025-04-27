package Arrays;

public class ex03 {
    public static void main(String[] args) {
        int[] num = new int[]{
                8, 9, 4, 2, 3, 5, 4, 7
        };
        int contadorPar = 0;

        for (int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                contadorPar ++;
            }

        }
        System.out.println(contadorPar + " são pares");
    }
}
