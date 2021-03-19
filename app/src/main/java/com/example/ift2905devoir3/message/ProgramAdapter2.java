package com.example.ift2905devoir3.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.example.ift2905devoir3.R;

public class ProgramAdapter2 extends ArrayAdapter<String> {
    Context context2;
    int[] images;
    String[] friendName2;
    public ProgramAdapter2(Context context, String[] friendName, int[] images){
        super(context, R.layout.single_item,R.id.textView1,friendName);
        this.images = images;
        this.friendName2=friendName;

    }
    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View singleItem = convertView;
        ProgramViewHolder holder = null;
        if(singleItem==null){
            LayoutInflater layoutInflater = (LayoutInflater) context2.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            singleItem=layoutInflater.inflate(R.layout.single_item,parent,false);
            holder= new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
        }
        else{
            holder = (ProgramViewHolder) singleItem.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.friendName.setText(friendName2[position]);


        return singleItem;
    }


}
