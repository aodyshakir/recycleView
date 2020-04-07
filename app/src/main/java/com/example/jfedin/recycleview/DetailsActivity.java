package com.example.jfedin.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String Result =intent.getStringExtra("name");
        TextView textView = findViewById(R.id.tv);
        textView.setText(Result);
       // Toast.makeText(DetailsActivity.this,Result,Toast.LENGTH_LONG).show();
        int RImage =intent.getIntExtra("image1",0);
        ImageView imageView =findViewById(R.id.Image);
        imageView.setImageResource(RImage);




    }
}
