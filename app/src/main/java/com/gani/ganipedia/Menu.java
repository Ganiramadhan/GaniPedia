package com.gani.ganipedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Shopping (View view){
        Intent Shopping = new Intent(Menu.this, Shopping.class);
        startActivity(Shopping);
    }

    public void Product (View view){
        Intent Product = new Intent(Menu.this, Product.class);
        startActivity(Product);
    }



    public void Food (View view){
        Intent Food = new Intent(Menu.this, food.class);
        startActivity(Food);
    }


    public void Contact (View view){
        String url = "https://api.whatsapp.com/send?phone=6283878624702";
        Intent wa = new Intent (Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(wa);
    }
    public void exit (View view){
        finish();
    }


}