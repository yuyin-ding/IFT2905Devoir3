package com.example.ift2905devoir3.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ift2905devoir3.R;

public class CreateAccount2Activity extends AppCompatActivity {

    private Button button;
    private TextView retourCreation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);

        Intent intent = getIntent();
        retourCreation=findViewById(R.id.retour);
        retourCreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retourCreation();
            }
        });

    }
    /** Called when the user taps the retour button */
    public void retourCreation()
    {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
}