package construtor;

public class Ex04_Retangulo {
    double largura;
    double altura;

    public Ex04_Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void calcular(){
        double area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}
