package com.example.javatask02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    List list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listview = (ListView)findViewById(R.id.list_view);

        list.add("LIKES");
        list.add("Video Games");
        list.add("Anime");
        list.add("DISLIKES");
        list.add("Slow Internet");
        list.add("Heat");
        list.add("Unnecessary Argument");
        list.add("HOBBIES");
        list.add("Playing Video Games");
        list.add("Watching Anime");
        list.add("Youtube");

        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1, list );
        listview.setAdapter(adapter);

    }
}
