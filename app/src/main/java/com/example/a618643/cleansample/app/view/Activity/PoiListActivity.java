package com.example.a618643.cleansample.app.view.Activity;

import com.example.a618643.cleansample.R;

import android.app.Activity;
import android.os.Bundle;

import retrofit2.Retrofit;

/**
 * Created by a618643 on 02/02/2016.
 */
public class PoiListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi_list);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://t21services.herokuapp.com/points")
                .build();

    }
}
