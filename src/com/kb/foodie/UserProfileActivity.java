package com.kb.foodie;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class UserProfileActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup_dialog);
    }

    public void handleServiceProvider(View view){
        setContentView(R.layout.service_provider_home);
    }

    public void handleServiceFinder(View view){
        setContentView(R.layout.service_home);
    }
}
