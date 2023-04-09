package com.example.myroomdatabase.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myroomdatabase.db.model.Album;

import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.BeanHolder> {

    private List<Album> list;
    private Context context;
    private LayoutInflater layoutInflater;
    private OnRecItemClick onRecItemClick;

    public AlbumsAdapter(List<Album> list, Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.list = list;
        this.context = context;
        this.onRecItemClick = (OnRecItemClick) context;
    }

    @NonNull
    @Override
    public AlbumsAdapter.BeanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(android.R.layout.rec_list_item, parent, false);
        return new BeanHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumsAdapter.BeanHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface OnRecItemClick {
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
