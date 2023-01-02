package com.me_manas.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model_rcycView> al=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rcv = findViewById(R.id.recycle_view);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        al.add(new Model_rcycView(R.drawable.a,"A","123"));
        al.add(new Model_rcycView(R.drawable.b,"B","234"));
        al.add(new Model_rcycView(R.drawable.c,"C","345"));
        al.add(new Model_rcycView(R.drawable.d,"D","456"));
        al.add(new Model_rcycView(R.drawable.e,"E","567"));
        al.add(new Model_rcycView(R.drawable.f,"F","678"));
        al.add(new Model_rcycView(R.drawable.g,"G","789"));
        al.add(new Model_rcycView(R.drawable.h,"H","890"));
        al.add(new Model_rcycView(R.drawable.i,"I","901"));
        al.add(new Model_rcycView(R.drawable.j,"J","012"));
        al.add(new Model_rcycView(R.drawable.k,"K","234"));
        al.add(new Model_rcycView(R.drawable.a,"A","123"));
        al.add(new Model_rcycView(R.drawable.f,"F","678"));
        al.add(new Model_rcycView(R.drawable.g,"G","789"));
        al.add(new Model_rcycView(R.drawable.h,"H","890"));
        al.add(new Model_rcycView(R.drawable.i,"I","901"));
        al.add(new Model_rcycView(R.drawable.j,"J","012"));
        al.add(new Model_rcycView(R.drawable.k,"K","234"));

        RecyclerView.Adapter adapter = new ContactAdapter(this,al);
        rcv.setAdapter(adapter);

    }
}
