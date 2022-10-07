package br.ulbra.com.visualizadordeimagens;
import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;
public class MainActivity extends Activity {
    ImageView imgfoto;
    Button btnfoto1, btnfoto2;
    TextView txtinformacao;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgfoto = (ImageView) findViewById(R.id.imgHappy);

        btnfoto1 = (Button) findViewById(R.id.btnHappy);
        btnfoto2 = (Button) findViewById(R.id.btnDbd);
        txtinformacao = (TextView) findViewById(R.id.txtHappy);
        btnfoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.happy);
                txtinformacao.setText("Happy!!!");
            } });
        btnfoto2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.dbd);
                txtinformacao.setText("GhostFace :()");

            } }); } }