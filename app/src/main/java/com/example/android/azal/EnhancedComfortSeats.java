package com.example.android.azal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class EnhancedComfortSeats extends AppCompatActivity implements View.OnClickListener {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhanced_comfort_seats);
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener((View.OnClickListener) this);
        Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
            pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("pre_sale.pdf").load();
        }

        if(view.getId() == R.id.button2) {
            pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("seat_sale_at_airport.pdf").load();
        }
    }

}
