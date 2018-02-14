package com.example.chirag.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView TvShows;
    TvShowAdapter tvShowAdapter;
    ArrayList<TvShow> tvShows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShows = (ArrayList)DataSource.createListItems();
        tvShowAdapter = new TvShowAdapter(tvShows);

        TvShows = (RecyclerView)findViewById(R.id.TvShows);
        TvShows.setLayoutManager(new LinearLayoutManager(this));
        TvShows.setItemAnimator(new DefaultItemAnimator());
        TvShows.setAdapter(tvShowAdapter);

    }
}
