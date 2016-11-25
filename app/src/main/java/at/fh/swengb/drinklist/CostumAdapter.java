package at.fh.swengb.drinklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.drinklist.model.Drink;

/**
     * Created by laszlobalo on 19.11.16.
 */

public class CostumAdapter extends BaseAdapter {

    List<Drink> listDrink;
    Context context;
    LayoutInflater inflter;

    public CostumAdapter(Context applicationContext, List<Drink> listDrink) {
        this.context = applicationContext;
        this.listDrink= listDrink;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listDrink.size();
    }

    @Override
    public Object getItem(int i) {
        return listDrink.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewCreator=(TextView)view.findViewById(R.id.textViewListCreator);
        TextView viewContent = (TextView)view.findViewById(R.id.textViewName);

        Drink drink = listDrink.get(i);
        viewName.setText(drink.getName());
        viewCreator.setText(drink.getCreator());
        viewContent.setText(drink.getIngredients());

        return view;
    }
}
