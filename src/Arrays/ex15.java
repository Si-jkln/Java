package Arrays;

public class ex15 {
    public static void main(String[] args) {
        int[] num = new int[]{
                7, 5, 6, 2, 9, 1
        };

        int maior = num[0];
        int menor = num[0];

        for(int i = 0; i < num.length; i++){
            if(maior < num[i]){
                maior = num[i];
            }
            if(menor > num[i]){
                menor = num[i];
            }
        }

        System.out.println("O maior número encontrado foi: " + maior + " e o menor número encontrado foi: " + menor );
    }
}
