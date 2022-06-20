package formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.layoutviacodigo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.MainActivity;
import formacao.desenvolvedores.tecnologia.projetodesistemasorientadoaobjetos.R;

public class ProgramarLayout extends AppCompatActivity {
    public static final int BTN_PRESSIONAR_BOTAO_ID = 125478;
    private static final int EDT_NOME_ID            = 125479;
    private LocalDateTime data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Não será usado o layout XML
        //setContentView(R.layout.activity_programar_layout);

        //O botão é instanciado 1º p/ poder ser incluido no layout
        Button btnPressionar = new Button(this);

        RelativeLayout layoutAct = new RelativeLayout(this);

        //Define a cor de fundo do layout
        layoutAct.setBackgroundColor(Color.BLUE);

        //Define o texto e cor de fundo do botão
        btnPressionar.setText("Pressione");

        //Define texto e cor de fundo do botão
        btnPressionar.setText("Pressione");
        btnPressionar.setBackgroundColor(Color.YELLOW);

        final EditText edtNome = new EditText(this);

        //Usando IDs view. Foi criado préviamento o arquivo de resource id.xml
        btnPressionar.setId(BTN_PRESSIONAR_BOTAO_ID);
        edtNome.setId(EDT_NOME_ID);
        edtNome.setBackgroundColor(Color.WHITE);
        edtNome.setTextColor(Color.BLACK);
        edtNome.setFocusable(false);
        edtNome.setClickable(false);
        edtNome.setCursorVisible(false);
        edtNome.setGravity(Gravity.CENTER);

        //Define Altura(height) e largura(width) do botão (widget) para armazaenar o conteúdo
        RelativeLayout.LayoutParams parametrosBtnPressionar = new RelativeLayout.
                LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        //Centralizar botão dentro do layout
        parametrosBtnPressionar.addRule(RelativeLayout.CENTER_HORIZONTAL);
        parametrosBtnPressionar.addRule(RelativeLayout.CENTER_VERTICAL);

        //Define Altura(height) e largura(width) do EditText (widget) para armazenar o conteúdo
        RelativeLayout.LayoutParams parametrosEdtNome = new RelativeLayout.
                LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        //Posicione o edtNome acima do botão que está centralizado
        parametrosEdtNome.addRule(RelativeLayout.ABOVE, btnPressionar.getId());
        parametrosEdtNome.addRule(RelativeLayout.CENTER_HORIZONTAL);
        parametrosEdtNome.setMargins(0, 0, 0, 80);

        //Atenção para não vincular uma View + de uma vez no código para não gerar exceção:

        layoutAct.addView(btnPressionar, parametrosBtnPressionar);
        layoutAct.addView(edtNome, parametrosEdtNome);

        //Uma outra forma de informar ao layout o widget\parametros
        //btnPressionar.setLayoutParams(parametrosBtnPressionar);

        //Converter dp em px
        Resources r = getResources();
        int pixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                200, r.getDisplayMetrics());

        edtNome .setWidth(pixels);

        setContentView(layoutAct);

        btnPressionar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                LocalDateTime hj = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                edtNome.setText("Data: " + hj.format(formatter));
            }
        });
    }
}