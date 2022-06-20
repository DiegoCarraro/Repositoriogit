package formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;

public class Motocicleta extends Veiculo implements IMotor {
    public static final String TAG = "Moto";

    public Motocicleta() {}

    @Override
    public void ligar() {
        Log.d(TAG, " A moto está ligando");
        super.ligar();
    }

    public void acelerar(){
        Log.d(TAG, " A moto está acelerando");
    }

    @Override
    public String getModelo() {
        return " O motor da motocicleta é de 200 cilíndradas";
    }

    @Override
    public String getFabricante() {
        return " O fabricante do motor é Paraguaio ";
    }
}








































