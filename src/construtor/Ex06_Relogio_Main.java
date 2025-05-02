package construtor;

public class Ex06_Relogio_Main {
    public static void main(String[] args) {
        Ex06_Relogio mostrar = new Ex06_Relogio(10, 45, 21);


        while (true){
            mostrar.avancarSegundos();
            mostrar.mostrarHora();

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
