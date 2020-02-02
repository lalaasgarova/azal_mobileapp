package com.example.android.azal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Career extends AppCompatActivity implements View.OnClickListener{

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
            pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("information_for_agents.pdf").load();
        }
    }

}

