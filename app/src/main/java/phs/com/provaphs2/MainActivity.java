package phs.com.provaphs2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String result;
    private String texto = "Total do Pedido: R$";
    private TextView txtTela;
    private Button btnPizzaModa2;
    private Button btnPizza4Queijo2 ;
    private Button btnPizzaAliche2;
    private Button btnPizzaCalabresa2;
    private Button btnPizzaPeperoni2;

    private Double valor = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnPizzaModa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = valor + 25.0;
                result = texto + Double.toString(valor);
                txtTela.setText(result);
            }
        });
        btnPizza4Queijo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = valor + 27.25;
                result = texto + Double.toString(valor);
                txtTela.setText(result);
            }
        });
        btnPizzaAliche2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = valor + 35.0;
                result = texto + Double.toString(valor);
                txtTela.setText(result);
            }
        });
        btnPizzaCalabresa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = valor + 21.5;
                result = texto + Double.toString(valor);
                txtTela.setText(result);
            }
        });
        btnPizzaPeperoni2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = valor + 23.0;
                result = texto + Double.toString(valor);
                txtTela.setText(result);
            }
        });

    }
    public void initViews() {
        txtTela = findViewById(R.id.txtValor);
        btnPizzaModa2 = findViewById(R.id.btnPizzaModa);
        btnPizza4Queijo2 = findViewById(R.id.btnPizza4Quejo);
        btnPizzaAliche2 = findViewById(R.id.btnPizzaAliche);
        btnPizzaCalabresa2 = findViewById(R.id.btnPizzaCalabresa);
        btnPizzaPeperoni2 = findViewById(R.id.btnPizzaPeperoni);
    }
}
