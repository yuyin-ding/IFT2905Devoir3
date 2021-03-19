package com.example.ift2905devoir3.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ift2905devoir3.R;

public class ProgramViewHolder {

    ImageView itemImage;
     TextView  friendName;
     TextView  message;
     ProgramViewHolder(View v){
         itemImage =v.findViewById(R.id.imageView);
         friendName=v.findViewById(R.id.textView1);
         message=v.findViewById(R.id.textView2);
     }

}
