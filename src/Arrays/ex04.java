package Arrays;

public class ex04 {
    public static void main(String[] args) {
        int[] num = new int[]{
                5, 8, 10, 25, 14
        };

        for (int i = 4; i >= 0; i--){ /* o indice de um array sempre inicia em 0, nesse caso é possivel utilizar o .length - 1, que fara o mesmo*/
            System.out.println(num[i]);
        }
    }
}
