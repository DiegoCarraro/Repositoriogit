package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;

public class Carro extends Veiculo implements IMotor {// palavra extends cria a relação de Herança.

    public static final String TAG = "Carro";
    public Carro() {}

    @Override

    public void ligar() {
        Log.d(TAG, "Ligando o carro...");
        super.ligar();
    }

    public void acelerar(){
        Log.d(TAG,"Acelerando o carro...");
    }

    @Override
    public String getModelo() {
        return " O carro possui um motor de 6 cilindros";
    }

    @Override
    public String getFabricante() {
        return " O fabricante do motor do carro é Americano";
    }
}
