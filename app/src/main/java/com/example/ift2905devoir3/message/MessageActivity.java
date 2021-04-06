package com.example.ift2905devoir3.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ift2905devoir3.R;
import com.example.ift2905devoir3.ui.login.CreateAccount2Activity;
import com.example.ift2905devoir3.ui.login.CreateAccountActivity;
import com.example.ift2905devoir3.ui.login.LoginActivity;

public class MessageActivity extends AppCompatActivity {

     ListView messageProgram;
     String[] friendName={"Etudiant Info","Etudiant Club","Etudiant3","Nom 4","Nom 5"};
     String[] message={"Vous:Hello -10:53","Oui interessant -14:00","Excellent -12:00",
             "Vous:Oui toi? -11:00","Vous:Oui -12:03"};
     //Search
     private EditText search;
     int[] programImage ={R.drawable.user,R.drawable.user1,R.drawable.user2,R.drawable.user3,
             R.drawable.user4};
    ProgramAdapter programAdapter;
   // private TextView fenetreMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        messageProgram=findViewById(R.id.messageProgram);
        search = findViewById(R.id.search);
        programAdapter = new ProgramAdapter(this,friendName,programImage,message);
        messageProgram.setAdapter(programAdapter);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                   (MessageActivity.this).programAdapter.getFilter().filter(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }


    public void fenetre_messages(){
        Intent fenetre_messages = new Intent(this,Fenetre_message_activity.class);
        startActivity(fenetre_messages);
    }
    public void newMessage(View v) {
        Intent newMessage = new Intent(this,New_message_activity.class);
        startActivity(newMessage);

    }

}
