package construtor;

public class Ex01_Carro {
   //criando os atribulos da classe carrro
    String modelo;
    int ano;



    public Ex01_Carro(String modelo, int ano){ //construtor
        this.modelo = modelo; // inicializa o atributo "modelo" com o valor recebido
        this.ano = ano; // inicializa o atributo "ano" como valor recebido
    }

    /*mostra as informações*/
    public void mostrarInfor(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
