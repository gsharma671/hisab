package com.example.hissab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText opening;
    EditText closing;
    EditText testing;
    EditText paytm;
    EditText cash;
    EditText axis;
    EditText rate;
    EditText balance;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opening=findViewById(R.id.opening);
        closing=findViewById(R.id.closing);
        testing=findViewById(R.id.testing);
        paytm=findViewById(R.id.paytm);
        cash=findViewById(R.id.cash);
        axis=findViewById(R.id.axis);
        rate=findViewById(R.id.rate);
        balance=findViewById(R.id.balance);
        calculate=findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double open,close,test,payt,cas,axi,rat,balan;
                open=Double.parseDouble(opening.getText().toString());
                close=Double.parseDouble(closing.getText().toString());
                test=Double.parseDouble(testing.getText().toString());
                payt=Double.parseDouble(paytm.getText().toString());
                cas=Double.parseDouble(cash.getText().toString());
                axi=Double.parseDouble(axis.getText().toString());
                rat=Double.parseDouble(rate.getText().toString());
                balan=(close-open)-(rat*test)-(payt+cas+axi);
                balance.setText("BALANCE ="+balan.toString());
            }
        });
        Button clear=(Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                opening.setText("");
                closing.setText("");
                paytm.setText("");
                testing.setText("");
                cash.setText("");
                axis.setText("");
                rate.setText("");
                balance.setText("");
            }
        });

    }
}