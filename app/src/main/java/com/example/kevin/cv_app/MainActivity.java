package com.example.kevin.cv_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView general;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        general = (ListView) findViewById(R.id.generalListView);

        List<ItemModel> itemList = new ArrayList<>();
        itemList.add(new ItemModel("Compétences", "competence", "Accéder aux compétences", "Competences"));
        itemList.add(new ItemModel("Expériences", "experience", "Accéder aux expériences", "Experiences"));
        itemList.add(new ItemModel("Formations", "formation", "Accéder aux formations", "Formations"));

        general.setAdapter(new ItemAdapter(this, itemList));
    }
}
