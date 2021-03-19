package com.example.ift2905devoir3.ui.login;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.ift2905devoir3.R;
import com.example.ift2905devoir3.message.MessageActivity;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputEmail = findViewById(R.id.email);
        textInputPassword = findViewById(R.id.password);


    }
    private boolean validateEmail(){
        String emailInput = textInputEmail.getEditText().getText().toString().trim();

        if(emailInput.isEmpty()){
            textInputEmail.setError("Ce champ est obligatoire");
            return false;
        }else{
            textInputEmail.setError(null);
            textInputEmail.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validatePassword(){
        String passwordInput = textInputPassword.getEditText().getText().toString().trim();
        if(passwordInput.isEmpty()){
            textInputPassword.setError("Ce champ est obligatoire");
            return false;
        }else if(passwordInput.length()<8){
            textInputPassword.setError("Mot de passe trop court.\n" +"Votre mot de passe doit contenir minimum 8 caractères" );
            return false;
        }else{
            textInputPassword.setError(null);
            return true;
        }

    }
    public void confirmInput(View v){
        if(!validateEmail()| validatePassword()){
            return;
        }
        String input = "Courriel:"+textInputEmail.getEditText().getText().toString();
        input+="\n";
        input+="Mot de passe:"+textInputPassword.getEditText().getText().toString();
        input+="\n";

        Toast.makeText(this,input,Toast.LENGTH_SHORT).show();

    }
    public void forgotPassword(View v){
        Intent messages= new Intent(LoginActivity.this, MessageActivity.class);
        startActivity(messages);

    }
    /** Called when the user taps the Engeristrer textView */
    public void enregistrement(View v){
        Intent create_an_account= new Intent(LoginActivity.this, CreateAccountActivity.class);
        startActivity(create_an_account);
    }


}