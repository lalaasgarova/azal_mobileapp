package com.example.android.azal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CorporateInformation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate_info);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);
        Button button15 = (Button) findViewById(R.id.button15);
        Button button16 = (Button) findViewById(R.id.button16);
        button12.setOnClickListener((View.OnClickListener) this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button12:
                Intent intent12 = new Intent(this, InternationalCarriageContract.class);
                startActivity(intent12);
                break;
            case R.id.button13:
                Intent intent13 = new Intent(this, SpecialCasesOfTransportation.class);
                startActivity(intent13);
                break;
            case R.id.button14:
                Intent intent14 = new Intent(this, TransportationOfAGroup.class);
                startActivity(intent14);
                break;
            case R.id.button15:
                Intent intent15 = new Intent(this, SalesOffices.class);
                startActivity(intent15);
                break;
            case R.id.button16:
                Intent intent16 = new Intent(this, InformationForAgents.class);
                startActivity(intent16);
                break;

            default:
                break;
        }
    }
}
