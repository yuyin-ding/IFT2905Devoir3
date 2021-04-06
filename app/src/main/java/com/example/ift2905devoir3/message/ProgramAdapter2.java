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
        this.context2 = context;
        this.images = images;
        this.friendName2=friendName;

    }
    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View singleItem2 = convertView;
        ProgramViewHolder2 holder = null;
        if(singleItem2==null){
            LayoutInflater layoutInflater = (LayoutInflater) context2.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            singleItem2=layoutInflater.inflate(R.layout.single_item2,parent,false);
            holder= new ProgramViewHolder2(singleItem2);
            singleItem2.setTag(holder);
        }
        else{
            holder = (ProgramViewHolder2) singleItem2.getTag();
        }
        holder.itemImage2.setImageResource(images[position]);
        holder.friendName2.setText(friendName2[position]);



        return singleItem2;
    }


}
