package com.example.jjesusmonroy.jjesusmonroyandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.TextView);
        tv.setText("Quickly example of recycleview src=youtube");

        recycler=findViewById(R.id.recyclerId);
        //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        recycler.setLayoutManager(new GridLayoutManager(this,2));

        listDatos=new ArrayList<String>();
        for(int i=0;i<=50;i++){
            listDatos.add("Dato #"+i);
        }
        AdapterDatos adapter = new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);
    }
}
