package com.example.ladan.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double sum=0;
    EditText et1;
    String st1;
    String DT;
    String LastAns;
    double a=0.0;
    int c0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et1.setText(null);

    }

    public void PLUS(View view) {
        if(et1.getText()!=null) {
            st1 = et1.getText().toString();
            sum= sum+Double.parseDouble(st1);
            DT = "" + sum;
            et1.setText("");
            et1.setText(null);
        }

    }

    public void MINUS(View view) {
        if(et1.getText()!=null) {
            st1 = et1.getText().toString();
            sum = sum - Double.parseDouble(st1);
            DT = "" + sum;
            et1.setText("");
            et1.setText(null);
        }

    }

    public void KAFOL(View view) {
        if(et1.getText()!=null) {
            st1 = et1.getText().toString();
            sum = sum * Double.parseDouble(st1);
            DT = "" + sum;
            et1.setText("");
            et1.setText(null);
        }
    }

    public void HILOK(View view) {
        if(et1.getText()!=null) {
            st1 = et1.getText().toString();
            c0 = Integer.parseInt(st1);
            if (c0 != 0) {
                sum = sum / Double.parseDouble(st1);
                DT = "" + sum;
                et1.setText("");
                et1.setText(null);
            }
        }
    }
    public void SHAVE(View view) {
        LastAns = DT;
        et1.setText(LastAns);
    }

    public void AC(View view) {
        sum=0;
        DT = ""+sum;
        et1.setText(DT);
    }

    public void CREDITS(View view) {

        Intent si = new Intent(this,Main2Activity.class);
        si.putExtra("n",LastAns);
        startActivity(si);

    }
}