package gabriel.adolf.uno.conceitosintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {

    private Button btnFPerguntar;
    private TextView tvFResposta;
    private EditText edtFPergunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        tvFResposta = findViewById(R.id.tvFResposta);
        btnFPerguntar = findViewById(R.id.btnFPergunta);
        edtFPergunta = findViewById(R.id.edtFPergunta);

        btnFPerguntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaOutraActivity = new Intent(RespostaActivity.this, MainActivity.class);
                startActivity(irParaOutraActivity);
            }
        });
    }
}