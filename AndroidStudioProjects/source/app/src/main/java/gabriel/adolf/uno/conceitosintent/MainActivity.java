package gabriel.adolf.uno.conceitosintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPerguntar;
    private TextView tvExibirResposta;
    private EditText edtPergunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvExibirResposta = findViewById(R.id.tvExibirResposta);
        btnPerguntar = findViewById(R.id.btnPergunta);
        edtPergunta = findViewById(R.id.edtPergunta);

        btnPerguntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaOutraActivity = new Intent(MainActivity.this, RespostaActivity.class);
                startActivity(irParaOutraActivity);
            }
        });
    }
}