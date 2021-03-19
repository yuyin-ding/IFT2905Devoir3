package com.example.ift2905devoir3.message;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ift2905devoir3.R;
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
    ImageView ecrire_message;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        messageProgram=findViewById(R.id.messageProgram);
        search = findViewById(R.id.search);
        ecrire_message=findViewById(R.id.ecrireMessage);
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
        ecrire_message.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              new_message();
            }
        });


    }
    public void new_message()
    {
        Intent newMessage = new Intent(this,New_message_activity.class);
        startActivity(newMessage);
    }
    public void fenetre_messages(){
        Intent fenetre_messages = new Intent(this,Fenetre_message_activity.class);
        startActivity(fenetre_messages);
    }






}
