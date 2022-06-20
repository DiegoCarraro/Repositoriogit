package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.heranca;

import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class Mamifero {
    public static final String TAG = "Mamífero";

    public Mamifero() {}

    public void respirar() {
        Log.d(TAG,"Uma das características dos mamíferos é a respiração.");
    }

    public void dormem() {
        Log.d(TAG,"Uma das características dos mamíferos também é dormir");
    }

}
