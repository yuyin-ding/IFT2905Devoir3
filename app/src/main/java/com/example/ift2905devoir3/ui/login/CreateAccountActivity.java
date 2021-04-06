package com.example.ift2905devoir3.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.ift2905devoir3.R;

public class CreateAccountActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);


        button = (Button)findViewById(R.id.goNext);
        button2 = (Button) findViewById(R.id.goBack);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateAccount2();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authentification();
            }
        });

    }

    /** Called when the user taps the Suivant button */
    public void openCreateAccount2()
    {
        Intent intent = new Intent(this, CreateAccount2Activity.class);
        startActivity(intent);
    }
    /**Called when the user taps the back button*/
    public void authentification()
    {
        Intent auth = new Intent(this,LoginActivity.class);
        startActivity(auth);
    }

}