package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Leao;

public class Impressora {

    public static final String TAG = "Impressora";

    public Impressora() {}

    public void imprimir(double numeroDouble){
        Log.d(TAG,"Imprimir números double: " + numeroDouble);
    }

    public void imprimir(int numeroInteiro){
        Log.d(TAG,"Imprimir números inteiros: " + numeroInteiro);
    }

    public void imprimir(String texto){
        Log.d(TAG,"Imprimi a cadeia de caracteres: " + texto);
    }

}
