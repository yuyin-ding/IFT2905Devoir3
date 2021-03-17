package com.example.ift2905devoir3.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.ift2905devoir3.R;

public class createAccountActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Intent intent = getIntent();

        button = (Button)findViewById(R.id.goNext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateAccount2();
            }
        });
    }

    /** Called when the user taps the Suivant button */
    public void openCreateAccount2()
    {
        Intent intent = new Intent(this,createAccount2Activity.class);
        startActivity(intent);
    }
}