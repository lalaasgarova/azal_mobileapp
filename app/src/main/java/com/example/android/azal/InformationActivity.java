package com.example.android.azal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Button button = (Button) findViewById(R.id.button);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        button.setOnClickListener((View.OnClickListener) this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, InformationForPassengers.class);
                startActivity(intent);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(this, CorporateInformation.class);
                startActivity(intent7);
                break;
            case R.id.button8:
                Intent intent8 = new Intent(this, InformationAirportAndOtherDepartments.class);
                startActivity(intent8);
                break;
            default:
                break;
        }
    }
}
