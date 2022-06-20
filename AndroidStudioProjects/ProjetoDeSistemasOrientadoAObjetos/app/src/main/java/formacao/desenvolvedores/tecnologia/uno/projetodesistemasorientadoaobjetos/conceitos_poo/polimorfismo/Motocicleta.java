package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;

public class Motocicleta extends Veiculo implements IMotor {// palavra extends cria a relação de Herança.
    public static final String TAG = "Motocicleta";

    public Motocicleta() {}

    @Override

    public void ligar(){
        Log.d(TAG,"Ligando a Motocicleta");
        super.ligar();

    }

    public void acelerar(){
        Log.d(TAG,"Acelerando a Motocicleta");

    }

    @Override
    public String getModelo() {
        return " A motocicleta possui um motor 4 cilindros ";

    }

    @Override
    public String getFabricante() {
        return " O fabricante da motocicleta é Japonês ";

    }
}
