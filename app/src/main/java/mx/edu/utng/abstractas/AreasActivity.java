package mx.edu.utng.abstractas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by George on 22/01/2016.
 */
public class AreasActivity extends Activity {
    private Cuadrado cuadrado;
    private EditText edtLado;

    private Triangulo triangulo;
    private EditText edtLado1;
    private EditText edtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas_layout);
        cuadrado = new Cuadrado();
        edtLado = (EditText) findViewById(R.id.edt_lado);

        triangulo = new Triangulo();
        edtLado1 = (EditText) findViewById(R.id.edt_lado1);
        edtAltura = (EditText) findViewById(R.id.edt_altura);

    }
    public void calcular(View view){
        float lado = Float.parseFloat(edtLado.getText().toString());
        cuadrado.setLado(lado);
        Toast.makeText(this, "Area de Cuadrado "+cuadrado.calcularArea(), Toast.LENGTH_SHORT).show();
        float lado1 = Float.parseFloat(edtLado1.getText().toString());
        triangulo.setLado(lado1);
        float altura = Float.parseFloat(edtAltura.getText().toString());
        triangulo.setAltura(altura);
        Toast.makeText(this, "Area de Triangulo "+triangulo.calcularArea(), Toast.LENGTH_SHORT).show();
    }
}
