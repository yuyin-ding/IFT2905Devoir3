package com.example.ift2905devoir3.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ift2905devoir3.R;

public class ProgramViewHolder2 {

    ImageView itemImage2;
    TextView friendName2;
    ProgramViewHolder2(View v){
        itemImage2 =v.findViewById(R.id.imageView);
        friendName2=v.findViewById(R.id.textView1);

    }
}
