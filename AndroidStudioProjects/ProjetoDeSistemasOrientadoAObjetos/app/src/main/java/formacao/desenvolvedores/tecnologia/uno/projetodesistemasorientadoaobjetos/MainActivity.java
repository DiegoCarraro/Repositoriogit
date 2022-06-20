 package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Leao;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Mamifero;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Carro;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Impressora;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Motocicleta;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Veiculo;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.layoutviacodigo.ProgramarLayout;

 public class MainActivity extends AppCompatActivity {// palavra extends cria a relação de Herança.
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

        //conceito herança
        leao = new Leao();
        leao.respirar();
        leao.rugir();

        mamifero = new Mamifero();
        mamifero.respirar();
        mamifero.dormem();

        //Conceito de polimorfismo (estático)
        impressora = new Impressora();
        impressora.imprimir(10);
        impressora.imprimir("...");
        impressora.imprimir(Math.PI);

        carro = new Carro();
        moto = new Motocicleta();

        dirigir(carro);
        dirigir(moto);

        Log.d(TAG, carro.getModelo());
        Log.d(TAG, carro.getFabricante());

        Log.d(TAG, moto.getModelo());
        Log.d(TAG, moto.getFabricante());

        IMotor interfaceMotor = new Motocicleta();
        Log.d(TAG,"Agora foi instanciado a Interface IMOTOR que nos dá acesso, ESPECIFICAMENTE NESSE CASO, aos métodos públicos da classe Carro;" + interfaceMotor.getModelo());

        carro.ligar();
        carro.acelerar();

        moto.ligar();
        moto.acelerar();

        veiculo = new Veiculo();
        veiculo.ligar();
        veiculo.acelerar();


        if (!dirigir(new Carro()));{
           // Toast.makeText(this, "O objeto veículo é null, portanto não pode ser usado", Toast.LENGTH_LONG).show();
        }
        dirigir(new Motocicleta());


        IMotor iMotor = new Carro();
        Log.d(TAG,"onCreate:" + iMotor.getModelo());
        Log.d(TAG,"onCreate:" + iMotor.getFabricante());

        IMotor iMotor1 = new Motocicleta();
        Log.d(TAG,"onCreate:" + iMotor1.getFabricante());
        Log.d(TAG,"onCreate:" + iMotor1.getModelo());

        btnProgramarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaOutraActivity = new Intent(MainActivity.this, ProgramarLayout.class);
                startActivity(irParaOutraActivity);
               // Toast.makeText(MainActivity.this,"O botão foi clicado", Toast.LENGTH_LONG).show();

            }
        });

    }
    private boolean dirigir(Veiculo opala){
        boolean operacaoBemSucedida = false;
            if (opala != null){
                operacaoBemSucedida = true;
                opala.ligar();
                opala.acelerar();
            }
        return operacaoBemSucedida;
    /*private void dirigir(Veiculo veiculo){
        veiculo.ligar();
        veiculo.acelerar();
        }*/

    }
}