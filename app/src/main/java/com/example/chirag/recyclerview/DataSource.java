package com.example.chirag.recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chirag on 9/15/2017.
 */

public class DataSource {

    public static final String[] TvShows= {"Breaking Bad","Rick and Morty", "FRIENDS","Sherlock","Stranger Things"};
    public static final int[] TvShowImgs = {R.drawable.breaking_bad_logo,R.drawable.rick_and_morty_logoo,R.drawable.friends,R.drawable.sherlock,R.drawable.stranger_things};

    public static List<TvShow> createListItems()
    {
        List<TvShow> items = new ArrayList<>();

        for(int i=0;i<TvShows.length;i++)
        {
            TvShow tvShow = new TvShow();

            tvShow.setTvshow(TvShows[i]);
            tvShow.setImgTvshow(TvShowImgs[i]);

            items.add(tvShow);
        }
        return items;
    }
}
