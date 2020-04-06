package com.example.jfedin.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String Result =intent.getStringExtra("name");
        Toast.makeText(DetailsActivity.this,Result,Toast.LENGTH_LONG).show();
    }
}
