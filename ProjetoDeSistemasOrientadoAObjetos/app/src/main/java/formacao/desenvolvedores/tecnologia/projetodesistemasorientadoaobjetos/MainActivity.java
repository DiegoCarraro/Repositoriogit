package formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Leao;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Mamifero;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Carro;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Impressora;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Motocicleta;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Veiculo;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.layoutviacodigo.ProgramarLayout;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private Leao leao;
    private Mamifero mamifero;
    private Impressora impressora;
    private Carro carro;
    private Motocicleta moto;
    private Veiculo veiculo;
    private Button btnProgramarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProgramarLayout = findViewById(R.id.btnProgramarLayout);

        leao = new Leao();
        leao.respirar();
        leao.rugir();

        mamifero = new Mamifero();
        mamifero.respirar();

        impressora = new Impressora();
        impressora.imprimir(28);
        impressora.imprimir("Uma String é uma cadeia de caracteres");
        impressora.imprimir(Math.PI);

        carro = new Carro();
        carro.ligar();
        carro.acelerar();
        carro.getModelo();
        carro.getFabricante();

        moto = new Motocicleta();
        moto.acelerar();
        moto.ligar();
        moto.getModelo();
        moto.getFabricante();

        veiculo = new Veiculo();
        veiculo.acelerar();
        veiculo.ligar();

        dirigir(new Veiculo());

        if (!dirigir(new Motocicleta())); {
            //Toast.makeText(this, "null", Toast.LENGTH_LONG).show();
        }

        if (!dirigir(new Carro())); {
           // Toast.makeText(this, "O objeto veículo é null, portanto não pode ser usado", Toast.LENGTH_LONG).show();
        }

        IMotor iMotor = new Carro();
        Log.d(TAG, "onCreate:" + iMotor.getModelo());
        Log.d(TAG, "onCreate: " + iMotor.getFabricante());

        IMotor iMotor1 = new Motocicleta();
        Log.d(TAG, "onCreate: " + iMotor1.getModelo());
        Log.d(TAG, "onCreate: " + iMotor1.getFabricante());

        btnProgramarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaOutraActivity = new Intent(MainActivity.this, ProgramarLayout.class);
                startActivity(irParaOutraActivity);
                //Toast.makeText( MainActivity.this, "O botão foi clicado", Toast.LENGTH_LONG).show();

            }
        });

    }

    private boolean dirigir(Veiculo brasília) {
        boolean operacaoBemSucedida = false;
        if (brasília != null) {
            operacaoBemSucedida = true;
            brasília.ligar();
            brasília.acelerar();

        }
        return operacaoBemSucedida;

    }

}
