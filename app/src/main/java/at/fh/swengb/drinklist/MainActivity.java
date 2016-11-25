package at.fh.swengb.drinklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import at.fh.swengb.drinklist.model.Drink;

import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Drink> listDrinks;
    private ListView myListView;
    private CostumAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myGulaschList);

        listDrinks = new ArrayList<>();
        listDrinks.add(new Drink("B52","Alkohol",TRUE,"Patrick"));
        listDrinks.add(new Drink("Caipirinha","Alkohol",TRUE,"Patrick"));
        listDrinks.add(new Drink("Mochito","Alkohol",TRUE,"Patrick"));
        listDrinks.add(new Drink("Cola-Whisky","Alkohol",TRUE,"Patrick"));





        myAdapter = new CostumAdapter(this, listDrinks);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Drink selectedDrink = listDrinks.get(i);
        Intent intent = new Intent(view.getContext(),ShowDrinkActivity.class);
        intent.putExtra("drink", (Serializable) selectedDrink);
        startActivity(intent);

    }
}
