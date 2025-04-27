package Arrays;

public class ex14 {
    public static void main(String[] args) {
        int[] num = new int[]{
                5, 7, 4, 8, 3
        };

        int somador = 0;

        for(int i = 0; i < num.length; i++){
            somador += num[i];

        }
        System.out.println("A soma de todos os números é igual a:" + somador);
    }
}
