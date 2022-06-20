package formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

public class Impressora {
    private int x;

    public static final String TAG = "Impressora";

    public Impressora() {}

    public void imprimir(int numeroInteiro){
        Log.d(TAG, "Imprimir numeros Inteiros: " + numeroInteiro);
    }

    public void imprimir(String texto){
        Log.d(TAG, "Imprimir a cadeia de caracteres: " + texto );
    }

    public void imprimir(double numeroDouble) {
        Log.d(TAG, "Imprimir numeros double: " + numeroDouble);

    }

}
