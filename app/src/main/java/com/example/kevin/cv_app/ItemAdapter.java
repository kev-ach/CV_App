package com.example.kevin.cv_app;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    private Context context;
    private List<ItemModel> itemList;
    private LayoutInflater inflater;

    public ItemAdapter(Context context, List<ItemModel> itemList){
        this.context = context;
        this.itemList = itemList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.adapter_item, null);

        ItemModel currentItem = (ItemModel) getItem(i);
        String itemName = currentItem.getName();
        String memo = currentItem.getMemo();
        String buttonName = currentItem.getBtnName();
        final String nomClasse = currentItem.getNomClasse();

        ImageView itemIconView = view.findViewById(R.id.item_icon);
        String ressourceName = "item_" + memo + "_icon";
        int resId = context.getResources().getIdentifier(ressourceName, "drawable", context.getPackageName());
        itemIconView.setImageResource(resId);

        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(itemName);

        Button buttonNameView = view.findViewById(R.id.button_ressources);
        buttonNameView.setText(buttonName);

        buttonNameView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(nomClasse.equals("Competences")) {
                    Intent competences = new Intent(context, Competences.class);
                    context.startActivity(competences);
                }else if(nomClasse.equals("Experiences")) {
                    Intent experiences = new Intent(context, Experiences.class);
                    context.startActivity(experiences);
                }else if(nomClasse.equals("Formations")) {
                    Intent formations = new Intent(context, Formations.class);
                    context.startActivity(formations);
                }
            }
        });
        
        return view;
    }
}
