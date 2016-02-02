package com.example.a618643.cleansample.Navigation;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;

/**
 * Created by a618643 on 02/02/2016.
 */
public class Navigator {

    private Context context;

    public Navigator(Context context) {
        this.context = context;
    }

    public void PoiNavigate(Context context, Class<?> newClass) {
        if(context != null) {
            Intent nextClass = new Intent(context, newClass);
            context.startActivity(nextClass);
        }
    }
}
