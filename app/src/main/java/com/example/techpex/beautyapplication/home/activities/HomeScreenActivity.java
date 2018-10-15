package com.example.techpex.beautyapplication.home.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.techpex.beautyapplication.R;

public class HomeScreenActivity extends AppCompatActivity implements View.OnClickListener {

    CardView card_1, card_2, card_3, card_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        setLayoutRefs();
    }

    private void setLayoutRefs() {

        card_1 = findViewById(R.id.card_1);
        card_1.setOnClickListener(this);
        card_2 = findViewById(R.id.card_2);
        card_2.setOnClickListener(this);
        card_3 = findViewById(R.id.card_3);
        card_3.setOnClickListener(this);
        card_4 = findViewById(R.id.card_4);
        card_4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

       switch(view.getId())
        {
            case R.id.card_1 :
                openOffer1();
                break;
            case R.id.card_2 :
                openOffer2();
                break;
            case R.id.card_3 :
                openOffer3();
                break;
            case R.id.card_4 :
                openOffer4();
                break;
            default:
                break;
        }

    }

    private void openOffer4() {
    }

    private void openOffer3() {
    }

    private void openOffer2() {
    }

    private void openOffer1() {

        Intent intent = new Intent(HomeScreenActivity.this,SchemeDetailsActivity.class);
        startActivity(intent);
    }
}