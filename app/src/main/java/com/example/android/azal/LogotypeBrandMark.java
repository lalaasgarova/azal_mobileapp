package com.example.android.azal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class LogotypeBrandMark extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_for_agents);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("branding.pdf").load();
    }
}
