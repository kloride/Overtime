package com.kashim.seun.overtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login (View v){

        EditText AdminUserEditText = (EditText) findViewById(R.id.Edit__Admin_User);
        String AdminUser = AdminUserEditText.getText().toString();


        Intent loginIntent = new Intent(LoginActivity.this, WelcomeAdminUserActivity.class);
        loginIntent.putExtra("AdminUser", AdminUser);

        startActivity(loginIntent);

    }
}


