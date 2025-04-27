package Arrays;

public class ex08 {
    public static void main(String[] args) {
        int[] num = new int[]{
                1, 1, 1, 1, 1, 1
        };

        int somaNum = 0;
        for (int i = 0; i < num.length; i++){

            somaNum += num[i];
        }
        System.out.println("A soma de todos os números é: " + somaNum);
    }
}
