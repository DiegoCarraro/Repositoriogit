package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

public class Veiculo {
  public static final String TAG = "Veículo";

    public Veiculo() {}

    public void ligar(){
        Log.d(TAG,"Ligando o veículo");
    }

    public void acelerar(){
        Log.d(TAG,"Acelerando o veículo");
    }


}
