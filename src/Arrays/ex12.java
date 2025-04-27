package Arrays;

public class ex12 {
    public static void main(String[] args) {
        int[] num = new int[]{
                1, 3, 5, 2, 9
        };

        boolean verifica = true;

        for (int i = 0; i < num.length - 1; i++){
            if(num[i] > num[i+1]){
                verifica = false;
                break;
            }
        }

        if (verifica){
            System.out.println("Array esta em ordem crescente");
        }else{
            System.out.println("Array não esta em ordem crescente");
        }
    }
}
