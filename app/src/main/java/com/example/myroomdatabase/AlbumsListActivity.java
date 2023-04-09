package com.example.myroomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myroomdatabase.adapter.AlbumsAdapter;

public class AlbumsListActivity extends AppCompatActivity implements AlbumsAdapter.OnRecItemClick {

    private TextView textViewMsg;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_list);
    }

    @Override
    public void onRecClick(int pos) {

    }
}