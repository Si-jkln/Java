package construtor;

import java.util.Scanner;

public class Ex07_Filme {
    String nome;
    String genero;
    int anoLancamento;
    int duracao;

    Scanner input = new Scanner(System.in);

    public Ex07_Filme(String nome, String genero, int anoLancamento, int duracao){
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public void mostrar(){
        System.out.println("Informações sobre o filme");

        System.out.println("Nome: ");
        String nome = input.nextLine();

        System.out.println("Genêro: ");
        String genero = input.nextLine();

        System.out.println("Ano de lançamento: ");
        int anoLancamento = input.nextInt();

        System.out.println("Duração(em minutos):");
        int duracao = input.nextInt();

        if (duracao >= 120){
            System.out.println("Filme longo");
        } else {
            System.out.println("Filme curto");
        }

    }
}
