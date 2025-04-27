package Arrays;

public class ex06 {
    public static void main(String[] args) {
        int[] num = new int[]{
                -8, 9, -6, -12, 47, -2, 25, 34, 0, -1
        };

        int positivo = 0;
        int negativo = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] < 0){
                negativo ++;
            } else {
                positivo ++;
            }
        }

        System.out.println("Existem " + negativo + " números negativos e " + positivo + " números postivos");
    }
}
