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

/*
What I did:

Steps;
1: layout to show recycler view, here we use RecyclerView Xml
2: Initialize a variable with id of this recyclerview in
   main java file.
3: Set orientation(Layout Manager) of recyclerview at this moment.
4: Create a new layout file which contains view to be
   displayed in RecyclerView.(Card view gives a 3D touch)
5: Now create a structure class for storing data of each
   single recycler view item(And dont forget constructor to
   initialize data of class). Also called Model class.
6: Now createa a data set i.e., an arrayList of the
   structure class we build in previous step, because RecyclerView
   will display this list on the screen.
7: Now create an Adapter cLass, adapter is like a machine
   performing some task, here what adapter does is that it
   takes data from data set and using index basing
   fills the content of recycler view. Basically it
   fills the content of recycler view.
8: Adapter class requires a View Holder.What View holder does is
   that it simply holds data which was in XML form, as a
   View.
9: Now Adapter class has its three abstract methods which
   need to be implemented by us.
   1. onCreateViewHolder: this is used to create ViewHolders
      basically that number of view holder as the size of dataset.
   2. onBindViewHolder: this method set each item on its
      position in viewHolder i.e., it binds data on its position
      in viewHolder.
   3. getItemCount: Just returns the size of data set.
10: finally everything related to adapter is done.
12: Just use setadapter method for your recycler view using this
    Custom adapter's object reference. ;)
 */