package fr.umontpellier.exercice8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//Exercice 8 : Application simple pour consulter les horaires de trains
public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] horaires = new String[]
            {"08h:00"
            ,"09h:00"
            ,"10h:00",
             "11h:00",
             "12h:00",
              "13h:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.horaire_train, R.id.id_horaire, horaires);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition     = position;
                String  itemValue    = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  Horaire : " +itemValue , Toast.LENGTH_LONG)
                        .show();
            }
        });

    }
}