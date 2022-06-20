package formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

public class Veiculo  {
    public static final String TAG = "Veículo";

    public Veiculo() {}

    public void ligar(){
        Log.d(TAG, " O veículo está ligando");
    }

    public void acelerar(){
        Log.d(TAG, " O veículo está acelerando");
    }

}
