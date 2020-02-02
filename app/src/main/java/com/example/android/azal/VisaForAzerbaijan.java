package com.example.android.azal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VisaForAzerbaijan extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa_for_azerbaijan);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://evisa.gov.az/en/"));
            startActivity(intent);
        }
    }
}
