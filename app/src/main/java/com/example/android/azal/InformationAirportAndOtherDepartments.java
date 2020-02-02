package com.example.android.azal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InformationAirportAndOtherDepartments extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_and_od_info);

        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        button9.setOnClickListener((View.OnClickListener) this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button9:
                Intent intent9 = new Intent(this, SecurityActivity.class);
                startActivity(intent9);
                break;
            case R.id.button10:
                Intent intent10 = new Intent(this, AzalOilActivity.class);
                startActivity(intent10);
                break;
            case R.id.button11:
                Intent intent11 = new Intent(this, AirTrafficControl.class);
                startActivity(intent11);
                break;

            default:
                break;
        }
    }
}
