package com.example.ladan.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText et1;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1= (EditText)findViewById(R.id.et1);
        Intent gi = getIntent();
        st1 = gi.getStringExtra("n");
        et1.setText(st1);
    }

    public void BACK(View view) {
        Intent si = new Intent(this,MainActivity.class);
        startActivity(si);
    }
}
