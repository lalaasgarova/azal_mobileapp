package com.example.android.azal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ContactsActivity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton button8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton9);
        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener((View.OnClickListener) this);
        button4.setOnClickListener((View.OnClickListener) this);
        button5.setOnClickListener((View.OnClickListener) this);
        button6.setOnClickListener((View.OnClickListener) this);
        button8.setOnClickListener((View.OnClickListener) this);
        button9.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton:
                dialContactPhone("+ 994125988880");
                break;
            case R.id.imageButton2:
                sendMailCallCenter();
                break;
            case R.id.imageButton3:
                dialContactPhone("+ 994125988880");
                break;
            case R.id.imageButton4:
                sendMailAzalMiles();
                break;
            case R.id.imageButton5:
                dialContactPhone("+ 994125988880");
                break;
            case R.id.imageButton6:
                sendMailCallCenter();
                break;
            case R.id.imageButton8:
                sendMailAirline();
                break;
            case R.id.imageButton9:
                dialContactPhone("+18445988880");
                break;

            default:
                break;
        }
    }

    private void sendMailCallCenter() {
        String[] TO = {"callcenter@azal.az"};

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, TO);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }

    private void sendMailAzalMiles() {
        String[] TO = {"azalmiles@azal.az"};

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, TO);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }

    private void sendMailAirline() {
        String[] TO = {"airline@azal.az"};

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, TO);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}

