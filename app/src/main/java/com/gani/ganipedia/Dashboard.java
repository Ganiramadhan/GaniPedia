package com.gani.ganipedia;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void content (View view){
        Intent content = new Intent(Dashboard.this, Shopping.class);
        startActivity(content);
    }

    public void product (View view){
        Intent product = new Intent(Dashboard.this, Product.class);
        startActivity(product);
    }



    public void shopping (View view){
        Intent shopping = new Intent(Dashboard.this, Feedback.class);
        startActivity(shopping);
    }


    public void contact (View view){
        String url = "https://api.whatsapp.com/send?phone=6283878624702";
        Intent wa = new Intent (Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(wa);
    }
    public void exit (View view){
        finish();
    }


}