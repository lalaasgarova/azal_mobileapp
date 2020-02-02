package com.example.android.azal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InformationForPassengers extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Button button17 = (Button) findViewById(R.id.button17);
        Button button18 = (Button) findViewById(R.id.button18);
        Button button19 = (Button) findViewById(R.id.button19);
        Button button20 = (Button) findViewById(R.id.button20);
        Button button21 = (Button) findViewById(R.id.button21);
        Button button22 = (Button) findViewById(R.id.button22);
        Button button23 = (Button) findViewById(R.id.button23);
        Button button24 = (Button) findViewById(R.id.button24);
        Button button25 = (Button) findViewById(R.id.button25);
        Button button26 = (Button) findViewById(R.id.button26);
        Button button27 = (Button) findViewById(R.id.button27);
        Button button29 = (Button) findViewById(R.id.button29);
        Button button30 = (Button) findViewById(R.id.button30);
        Button button31 = (Button) findViewById(R.id.button31);
        Button button32 = (Button) findViewById(R.id.button32);
        button17.setOnClickListener((View.OnClickListener) this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button17:
                Intent intent17 = new Intent(this, GeneralInformation.class);
                startActivity(intent17);
                break;
            case R.id.button18:
                Intent intent18 = new Intent(this, CorporateInformation.class);
                startActivity(intent18);
                break;
            case R.id.button19:
                Intent intent19 = new Intent(this, InformationAirportAndOtherDepartments.class);
                startActivity(intent19);
                break;
            case R.id.button20:
                Intent intent20 = new Intent(this, InformationForPassengers.class);
                startActivity(intent20);
                break;
            case R.id.button21:
                Intent intent21 = new Intent(this, CorporateInformation.class);
                startActivity(intent21);
                break;
            case R.id.button22:
                Intent intent22 = new Intent(this, InformationAirportAndOtherDepartments.class);
                startActivity(intent22);
                break;
            case R.id.button23:
                Intent intent23 = new Intent(this, InformationForPassengers.class);
                startActivity(intent23);
                break;
            case R.id.button24:
                Intent intent24 = new Intent(this, CorporateInformation.class);
                startActivity(intent24);
                break;
            case R.id.button25:
                Intent intent25 = new Intent(this, InformationAirportAndOtherDepartments.class);
                startActivity(intent25);
                break;
            case R.id.button26:
                Intent intent26 = new Intent(this, InformationForPassengers.class);
                startActivity(intent26);
                break;
            case R.id.button27:
                Intent intent27 = new Intent(this, CorporateInformation.class);
                startActivity(intent27);
                break;
            case R.id.button29:
                Intent intent29 = new Intent(this, InformationAirportAndOtherDepartments.class);
                startActivity(intent29);
                break;
            case R.id.button30:
                Intent intent30 = new Intent(this, InformationForPassengers.class);
                startActivity(intent30);
                break;
            case R.id.button31:
                Intent intent31 = new Intent(this, CorporateInformation.class);
                startActivity(intent31);
                break;
            case R.id.button32:
                Intent intent32 = new Intent(this, InformationAirportAndOtherDepartments.class);
                startActivity(intent32);
                break;
            default:
                break;
        }
    }
}
