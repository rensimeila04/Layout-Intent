package com.rensimyl.www.layoutandintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TargetActivity extends AppCompatActivity {

    TextView txtResult;
    private String nama;
    private String EXTRA_DATA = "EXTRA_DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = findViewById(R.id.textHai);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(EXTRA_DATA);
        txtResult.setText("Hello, " + nama + " !");
    }
}
