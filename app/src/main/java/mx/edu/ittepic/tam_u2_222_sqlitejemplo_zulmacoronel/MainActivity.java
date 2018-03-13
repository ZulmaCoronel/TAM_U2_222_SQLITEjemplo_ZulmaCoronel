package mx.edu.ittepic.tam_u2_222_sqlitejemplo_zulmacoronel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adaptador adapter;
    private List<Vista> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        listItems.add(new Vista("Eva","Dentista"));
        listItems.add(new Vista("Ana","Abogada"));
        listItems.add(new Vista("Javier","Medico"));
        listItems.add(new Vista("Manuel","Arquitecto"));

        //Set adapter
        adapter = new Adaptador(listItems, this);
        recyclerView.setAdapter(adapter);
    }
}
