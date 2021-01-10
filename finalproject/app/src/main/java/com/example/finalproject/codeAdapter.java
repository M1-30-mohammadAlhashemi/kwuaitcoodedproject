package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class codeAdapter extends RecyclerView.Adapter{
    ArrayList<code> mArray;
    Context context;

    public codeAdapter(ArrayList<code> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.code,parent,false);
        ViewHolder vh =new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).name.setText( mArray.get(position).getName());
        ((ViewHolder)holder).information.setText( mArray.get(position).getImportant());
     ((ViewHolder)holder).img1.setImageResource( mArray.get(position).getImg());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,Details.class);
                i.putExtra("code",mArray.get(position));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img1;
        public TextView name;
        public TextView information;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img1 = view.findViewById(R.id.imageView2);
            name = view.findViewById(R.id.name);
            information = view.findViewById(R.id.textView5);


        }

    }
}

