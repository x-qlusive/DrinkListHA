package at.fh.swengb.drinklist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.drinklist.model.Drink;

public class ShowDrinkActivity extends AppCompatActivity {
    private Drink drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_drink);

        Intent intent = getIntent();
        drink = (Drink) intent.getExtras().get("drink");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewListName);
        TextView viewCreator = (TextView) findViewById(R.id.textViewListCreator);
        TextView viewIngredients = (TextView) findViewById(R.id.textViewIngredients);

        viewFirstName.setText(drink.getName());
        viewCreator.setText(drink.getCreator());
        viewIngredients.setText(drink.getIngredients());
    }
/*
    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+drink.getRestaurantAddress());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+drink.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }*/

}
