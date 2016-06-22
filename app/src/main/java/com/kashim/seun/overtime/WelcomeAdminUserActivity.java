package com.kashim.seun.overtime;

import android.content.Intent;
import android.widget.TextView;

/**
 * Created by USER on 6/17/2016.
 */
public class WelcomeAdminUserActivity {
    Intent welcomeIntent = getIntent();

    public WelcomeAdminUserActivity() {
        welcomeTextView = (TextView) welcomeTextView.findViewById(R.id.Button_Select_User_id);
    }

    private Intent getIntent() {
        return null;
    }

    String AdminUser = welcomeIntent.getStringExtra("AdminUser");

    TextView welcomeTextView;
}
