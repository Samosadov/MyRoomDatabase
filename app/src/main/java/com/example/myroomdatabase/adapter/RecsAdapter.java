package com.example.myroomdatabase.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myroomdatabase.db.Rec;

import java.util.List;

public class RecsAdapter extends RecyclerView.Adapter<RecsAdapter.BeanHolder> {

    private List<Rec> list;
    private Context context;
    private LayoutInflater layoutInflater;
    private OnRecItemClick onRecItemClick;

    public RecsAdapter(List<Rec> list, Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.list = list;
        this.context = context;
        this.onRecItemClick = (OnRecItemClick) context;
    }

    @NonNull
    @Override
    public RecsAdapter.BeanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(android.R.layout.note_list_item, parent, false);
        return new BeanHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecsAdapter.BeanHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private interface OnRecItemClick {
        void onRecClick(int pos);
    }

    private class BeanHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public BeanHolder(View v) {
        }

        @Override
        public void onClick(View view) {
            onRecItemClick.onRecClick(getAdapterPosition());
        }
    }
}
