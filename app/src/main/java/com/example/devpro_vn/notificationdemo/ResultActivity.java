package com.example.devpro_vn.notificationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by MyPC on 01/08/2017.
 */

public class ResultActivity extends AppCompatActivity {

    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtContent = (TextView) findViewById(R.id.txtContent);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("content");
        txtContent.setText(msg);

    }

}