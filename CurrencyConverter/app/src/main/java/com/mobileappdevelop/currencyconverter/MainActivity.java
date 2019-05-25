package com.mobileappdevelop.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText amount = findViewById(R.id.amountET);
        RadioButton dollerToTaka = findViewById(R.id.dollerToTakaRB);
        RadioButton takaToDoller = findViewById(R.id.takatoDollerRB);
        Button convert = findViewById(R.id.converterBtn);
        TextView result = findViewById(R.id.resultTV);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Currency Converter", Toast.LENGTH_LONG).show();
            }
        });
    }
}
