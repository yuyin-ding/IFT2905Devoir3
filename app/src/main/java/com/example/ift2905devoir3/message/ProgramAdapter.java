package com.example.ift2905devoir3.message;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.ift2905devoir3.R;


public class ProgramAdapter extends ArrayAdapter<String>  {
    MessageActivity messageActivity ;
    Context context;
    int[] images;
    String[] friendName;
    String[] message;
    public ProgramAdapter(Context context, String[] friendName, int[] images, String[] message){
        super(context, R.layout.single_item,R.id.textView1,friendName);
        this.context = context;
        this.images = images;
        this.friendName=friendName;
        this.message=message;

    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View singleItem = convertView;
        ProgramViewHolder holder = null;
        if(singleItem==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            singleItem=layoutInflater.inflate(R.layout.single_item,parent,false);
            holder= new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
        }
        else{
            holder = (ProgramViewHolder) singleItem.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.friendName.setText(friendName[position]);
        holder.message.setText(message[position]);

        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                messageActivity.fenetre_messages();
            }
        });

        return singleItem;
    }

}
