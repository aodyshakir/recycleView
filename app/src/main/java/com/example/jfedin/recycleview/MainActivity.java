package com.example.jfedin.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<WordClass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateArrayList();

        mRecyclerView = findViewById(R.id.recycleView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new WordAdapter(list);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }

    private void CreateArrayList() {
         list = new ArrayList<>();
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_android,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_android,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_android,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_android,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_android,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_android,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_mood,"text1","text2"));
        list.add(new WordClass(R.drawable.ic_android,"text1","text2"));
    }


}
