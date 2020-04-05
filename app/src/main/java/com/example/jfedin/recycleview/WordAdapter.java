package com.example.jfedin.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

     public ArrayList<WordClass> mArrayList ;


    public WordAdapter(ArrayList<WordClass> list) {
        mArrayList = list;

    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        WordViewHolder wordViewHolder = new WordViewHolder(v);

        return wordViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        WordClass currentItem = mArrayList.get(position);
        // pass value
       holder.mImageView.setImageResource(currentItem.getmImageView());
       holder.mTextView.setText(currentItem.getmTextV1());
       holder.mTextView2.setText(currentItem.getmTextV2());


    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public static class WordViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView;
        public TextView mTextView2;


        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView = itemView.findViewById(R.id.text1);
            mTextView2 = itemView.findViewById(R.id.text2);
        }
    }

}
