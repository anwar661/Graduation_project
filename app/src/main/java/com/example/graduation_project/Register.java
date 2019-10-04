package com.example.graduation_project;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class Register extends Activity {

    SharedPreferences usrAccs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void signUp(View V){
        EditText usr = (EditText) findViewById(R.id.usrInp);
        EditText pwd = (EditText) findViewById(R.id.pwdInp);
        EditText idn = (EditText) findViewById(R.id.idnum);
        EditText phn = (EditText) findViewById(R.id.phnum);

        usrAccs = getApplicationContext().getSharedPreferences("UsersAccounts", 0); // 0 - for private mode
        SharedPreferences.Editor usrAccsEditor = usrAccs.edit();

        if(usrAccs.contains(usr.getText().toString())){
            Toast.makeText(getApplicationContext(),"The user account is already existent",Toast.LENGTH_LONG).show();
            return;
        }else if(usrAccs.contains(idn.getText().toString())){
            Toast.makeText(getApplicationContext(),"The user account is already existent",Toast.LENGTH_LONG).show();
            return;}

        usrAccsEditor.putString(usr.getText().toString(),pwd.getText().toString());
        usrAccsEditor.commit();

        usrAccsEditor.putString(idn.getText().toString(),phn.getText().toString());
        usrAccsEditor.commit();

        Toast.makeText(getApplicationContext(),usrAccs.getString(usr.getText().toString(),null)+" account is created",Toast.LENGTH_LONG).show();

        Intent Int = new Intent(getApplicationContext(),Login.class);
        startActivity(Int);
        finish();

    }


}

