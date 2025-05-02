package construtor;

public class Ex06_Relogio {
    int hora;
    int minuto;
    int segundo;

    public Ex06_Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void avancarSegundos(){
        segundo++;

        if(segundo == 60){ /*reseta os segundo*/
            segundo = 0;
            minuto ++;
        }

        if( minuto == 60){ /* reseta os minutos*/
            minuto = 0;
            hora++;
        }

        if (hora == 24){ /*reseta as horas*/
            hora = 0;
        }
    }

    public  void mostrarHora(){
        System.out.printf("\r%02d:%02d:%02d", hora, minuto, segundo);
    }

}
