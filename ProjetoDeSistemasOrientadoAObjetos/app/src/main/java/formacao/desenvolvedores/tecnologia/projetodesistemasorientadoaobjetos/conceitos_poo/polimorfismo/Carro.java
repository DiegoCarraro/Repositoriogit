package formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;

public class Carro extends Veiculo implements IMotor {

        public static final String TAG = "Carro";

        public Carro() {}

        @Override
        public void ligar() {
                Log.d(TAG, " A brasília está ligando");
                super.ligar();
        }


        public void acelerar(){
                Log.d(TAG, " A brasília está acelerando");
        }


        @Override
        public String getModelo() {
                return " O carro possui um motor de 4 cilíndros";
        }

        @Override
        public String getFabricante() {
                return "O fabricante do motor do carro é Americano";
        }

}
