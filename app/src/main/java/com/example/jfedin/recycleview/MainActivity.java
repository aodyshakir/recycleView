package com.example.jfedin.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private WordAdapter mAdapter;
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

        mAdapter.SetOnClickListener(new WordAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                  String list1Text = list.get(position).getmTextV1();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name",list1Text);
                startActivity(intent);
            }
        });



    }

    private void CreateArrayList() {
         list = new ArrayList<>();
        list.add(new WordClass(R.drawable.number_one,"text1","text2"));
        list.add(new WordClass(R.drawable.number_two,"text2","text2"));
        list.add(new WordClass(R.drawable.number_three,"text3","text2"));
        list.add(new WordClass(R.drawable.number_four,"text4","text2"));
        list.add(new WordClass(R.drawable.number_five,"text5","text2"));
        list.add(new WordClass(R.drawable.number_six,"text6","text2"));
        list.add(new WordClass(R.drawable.number_seven,"text7","text2"));
        list.add(new WordClass(R.drawable.number_eight,"text8","text2"));
        list.add(new WordClass(R.drawable.number_nine,"text9","text2"));
        list.add(new WordClass(R.drawable.number_ten,"text10","text2"));
        list.add(new WordClass(R.drawable.color_white,"text11","text2"));
        list.add(new WordClass(R.drawable.color_black,"text12","text2"));
        list.add(new WordClass(R.drawable.color_brown,"text13","text2"));
        list.add(new WordClass(R.drawable.color_green,"text14","text2"));
        list.add(new WordClass(R.drawable.color_red,"text15","text2"));
    }


}
