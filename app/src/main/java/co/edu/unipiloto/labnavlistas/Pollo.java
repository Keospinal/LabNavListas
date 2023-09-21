package co.edu.unipiloto.labnavlistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pollo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo);

        ArrayAdapter<TipoCarnes> adaptado = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                TipoCarnes.CernesPollo
        );
        ListView listaRes=(ListView) findViewById(R.id.listapollo);
        listaRes.setAdapter(adaptado);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemview, int posicion, long l) {
                Intent res = new Intent(Pollo.this, MostrarContenido.class);
                res.putExtra("nombre",TipoCarnes.CernesRe[posicion].getName());
                res.putExtra("id",TipoCarnes.CernesRe[posicion].getDescription());
                res.putExtra("desc",TipoCarnes.CernesRe[posicion].getImageResourceId());
                startActivity(res);
            }
        };

        listaRes.setOnItemClickListener(onItemClickListener);
    }
}