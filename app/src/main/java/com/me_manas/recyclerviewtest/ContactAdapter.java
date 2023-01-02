package com.me_manas.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    Context context;
    ArrayList<Model_rcycView> al;
    public ContactAdapter(Context context,ArrayList<Model_rcycView> al){
        this.context=context;
        this.al=al;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View holderview= LayoutInflater.from(context).inflate(R.layout.item_rcycview, parent, false);
        return new ViewHolder(holderview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(al.get(position).name);
        holder.number.setText(al.get(position).number);
        holder.img.setImageResource(al.get(position).img);

    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name,number;
        ImageView img;
        public ViewHolder(View view){
            super(view);
            this.name = view.findViewById(R.id.contactname);
            this.number= view.findViewById(R.id.contactNumber);
            this.img= view.findViewById(R.id.contactimage);
        }
    }
}
