package Arrays;

public class ex07 {
    public static void main(String[] args) {
        int[] num = new int[]{
                7, 5, 2, 1, 9
        };

        int aux = num[0]; /*nesse caso ele pega o valor do indice 0, se dito seria: vou percorrer todos os números. Se encontranm um número menor qo que o que esta guradado em aux, troco o valor de aux*/

        for (int i = 0; i < num.length; i++){
            if(num[i] < aux){
                aux = num[i];
            }
        }
        System.out.println("O menor número encontrado foi: " + aux);
    }
}
