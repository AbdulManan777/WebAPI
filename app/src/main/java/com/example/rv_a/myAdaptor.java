package com.example.rv_a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdaptor extends RecyclerView.Adapter<myAdaptor.MyViewHolder> {
    List<MyModel> ls;
    Context c;

    public myAdaptor(List<MyModel> ls, Context c) {
        this.ls = ls;
        this.c = c;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(c).inflate(R.layout.row,parent, false);
        return new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(ls.get(position).getName());
        holder.num.setText(ls.get(position).getNum());
        holder.address.setText(ls.get(position).getAddess());
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, num, address;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            num = itemView.findViewById(R.id.num);
            address = itemView.findViewById(R.id.address);
        }
    }
}
