package co.edu.unipiloto.labnavlistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MostrarContenido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_contenido);
        Intent intent=getIntent();

        String title= intent.getStringExtra("nombre");
        int image= Integer.getInteger(intent.getStringExtra("id"));
        String desc = intent.getStringExtra("desc");

        ImageView imagen = (ImageView)findViewById(R.id.image);
        TextView titulo = (TextView) findViewById(R.id.Titulo);
        TextView descview = (TextView) findViewById(R.id.textDesctripcion);

        imagen.setImageResource(image);
        titulo.setText(title);
        descview.setText(desc);
    }
}