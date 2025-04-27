package Arrays;

public class ex11 {
    public static void main(String[] args) {
        double[] num = new double[]{
                5, 10, 15, 20, 25
        };

        double somasNotas = 0;

        for (int i = 0; i < num.length; i++){
            somasNotas += num[i];
        }

        double media = somasNotas/5;
        System.out.println("A média das 5 notas é igual a: " + media);
    }
}
