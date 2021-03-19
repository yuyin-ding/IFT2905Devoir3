package com.example.ift2905devoir3.message;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ift2905devoir3.R;
import com.example.ift2905devoir3.ui.login.LoginActivity;

public class New_message_activity extends AppCompatActivity {

        ListView messageProgram2;
        String[] friendName2={"Etudiant Info","Etudiant Club1","Etudiant3","Nom 4","Nom 5","Nom6","Ami7"};
        //Search
        private EditText search;
        int[] programImage2 ={R.drawable.user,R.drawable.user1,R.drawable.user2,R.drawable.user3,
                R.drawable.user4, R.drawable.user5, R.drawable.user6};
        ProgramAdapter2 programAdapter2;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_message);
            //messageProgram2=findViewById(R.id.messageProgram);
            search = findViewById(R.id.search);
            programAdapter2 = new ProgramAdapter2(this,friendName2,programImage2);
            messageProgram2.setAdapter(programAdapter2);
            search.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    (New_message_activity.this).programAdapter2.getFilter().filter(s);

                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });

        }
        public void cancelNewMessage(View v){
            Intent annulation= new Intent(New_message_activity.this, MessageActivity.class);
            startActivity(annulation);

        }




    }


