package com.example.usermanagement.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usermanagement.Models.RequestedListModel;
import com.example.usermanagement.R;

import java.util.ArrayList;

public class Adapter_RV_Home extends RecyclerView.Adapter<Adapter_RV_Home.MyViewHolder> {
    private Context context;
    private ArrayList<RequestedListModel> mdata;

    public Adapter_RV_Home(Context context, ArrayList<RequestedListModel> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item_rv_mainact,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt_Name.setText(mdata.get(position).getName());
        holder.txt_Title.setText(mdata.get(position).getTitle());
        holder.txt_Stats.setText(mdata.get(position).getStats());
        holder.txt_Address.setText(mdata.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt_Name , txt_Stats , txt_Address , txt_Title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_Name = itemView.findViewById(R.id.txt_itemRVMainAct_UsreName);
            txt_Address = itemView.findViewById(R.id.txt_itemRVMainAct_Address);
            txt_Stats = itemView.findViewById(R.id.txt_itemRVMainAct_Stats);
            txt_Title = itemView.findViewById(R.id.txt_itemRVMainAct_Title);
        }
    }
}
