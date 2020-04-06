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

     private ArrayList<WordClass> mArrayList ;


    public WordAdapter(ArrayList<WordClass> list) {
        mArrayList = list;

    }

    private OnItemClickListener mlistener ;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void SetOnClickListener (OnItemClickListener listener)
    {
        mlistener = listener;
    }



    // inner class
    public static class WordViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView;
        public TextView mTextView2;


        public WordViewHolder(@NonNull final View itemView , final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView = itemView.findViewById(R.id.text1);
            mTextView2 = itemView.findViewById(R.id.text2);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   if (listener != null)
                   {
                       int position = getAdapterPosition();
                       if (position != RecyclerView.NO_POSITION)
                       {
                           listener.onItemClick(position);
                       }
                   }
                }
            });


        }
    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        WordViewHolder wordViewHolder = new WordViewHolder(v ,mlistener);

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



}
