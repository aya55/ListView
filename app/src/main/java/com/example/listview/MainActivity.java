package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    listView=findViewById(R.id.listview);
        final ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Aya");
        arrayList.add("Diva");
        arrayList.add("Hekmat");
        arrayList.add("Asmaa");
        arrayList.add("Aml");
        arrayList.add("Reem");
        arrayList.add("Ahmed");
        arrayList.add("Mohamed");
        arrayList.add("Dalia");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,arrayList.get(position).toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
