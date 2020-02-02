package com.example.android.azal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class InformationForAgents extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_for_agents);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("information_for_agents.pdf").load();
    }
}
