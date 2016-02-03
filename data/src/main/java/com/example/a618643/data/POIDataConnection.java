package com.example.a618643.data;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class POIDataConnection extends AppCompatActivity {

    private URL url;
    private String requestType;
    private int responseCode = 0;
    private String response = "";


    private POIDataConnection(URL url, String requestType) throws MalformedURLException {
        this.url = url;
        this.requestType = requestType;
    }

    public static POIDataConnection createGET(URL url) throws MalformedURLException {
        return new POIDataConnection(url, "GET");
    }

    private void connect() {
        HttpURLConnection httpURLConnection = null;

        try{
            httpURLConnection = (HttpURLConnection) url.openConnection();
            setupConnection(httpURLConnection);

        }
    }

    private void setupConnection(HttpURLConnection connection) throws IOException {
        if(connection != null) {
            connection.setRequestMethod(requestType);
            connection.setReadTimeout(10000);
            connection.setConnectTimeout(15000);
            connection.setDoInput(true);
            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        }
    }


}