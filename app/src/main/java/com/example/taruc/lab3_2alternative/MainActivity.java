package com.example.taruc.lab3_2alternative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMesaage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMesaage=findViewById(R.id.textViewMessage);

    }
    public void showMessage(View view) {

        textViewMesaage.setText(getString(R.string.message));
    }
}
