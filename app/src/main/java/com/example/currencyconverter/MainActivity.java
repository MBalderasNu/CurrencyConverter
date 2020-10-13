package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        EditText currencyInput = (EditText)findViewById(R.id.currencyInputEditText);

        String amountInPounds = currencyInput.getText().toString();

        double amountInPoundsParsed = Double.parseDouble(amountInPounds);

        double amountInDollars = amountInPoundsParsed * 1.24;

        String poundsToDollars = String.format("%.2f", amountInDollars);

        Toast.makeText(this, "£" + amountInPounds + " is $" + poundsToDollars, Toast.LENGTH_LONG).show();;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
