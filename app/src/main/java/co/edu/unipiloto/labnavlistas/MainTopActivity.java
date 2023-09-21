package co.edu.unipiloto.labnavlistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainTopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_activity_main);
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemview, int posicion, long l) {
                switch (posicion){
                    case 0:
                        Intent res = new Intent(MainTopActivity.this, Res.class);
                        startActivity(res);
                        break;
                    case 1:
                        Intent cerdo = new Intent(MainTopActivity.this, Cerdo.class);
                        startActivity(cerdo);
                        break;
                    case 2:
                        Intent pollo = new Intent(MainTopActivity.this, Pollo.class);
                        startActivity(pollo);
                        break;
                }
            }
        };

        ListView opciones = findViewById(R.id.listView);
        opciones.setOnItemClickListener(onItemClickListener);
    }
}