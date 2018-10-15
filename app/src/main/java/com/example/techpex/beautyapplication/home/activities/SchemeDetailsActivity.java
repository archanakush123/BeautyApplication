package com.example.techpex.beautyapplication.home.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.techpex.beautyapplication.R;

public class SchemeDetailsActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_fix_appointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme_details);
        setLayoutRefs();
    }

    private void setLayoutRefs() {

        btn_fix_appointment = findViewById(R.id.btn_fix_appointment);
        btn_fix_appointment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_fix_appointment:
                openFixAppointment();
                break;
        }
    }

    private void openFixAppointment() {

        Intent  intent = new Intent(SchemeDetailsActivity.this,FixAppointmentActivity.class);
        startActivity(intent);
        finish();
    }
}