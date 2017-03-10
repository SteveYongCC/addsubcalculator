package com.example.w10nkr.addsubcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    //step1 : create all the variables.
    EditText input1, input2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step2 : get all the views from xml file.
        input1 = (EditText) findViewById(R.id.textBox1);
        input2 = (EditText) findViewById(R.id.textBox2);

        b1 = (Button) findViewById(R.id.addBtn);
        b2 = (Button) findViewById(R.id.subBtn);

        //step3 : write add functionality.
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = input1.getText().toString();
                int i = Integer.parseInt(f);
                String s = input2.getText().toString();
                int j = Integer.parseInt(s);

                Integer result = i+j;
                String res = result.toString();

                Toast.makeText(MainActivity.this, "Result " + result, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = input1.getText().toString();
                int i = Integer.parseInt(f);
                String s = input2.getText().toString();
                int j = Integer.parseInt(s);

                Integer result = i-j;
                String res = result.toString();

                Toast.makeText(MainActivity.this, "Result " + result, Toast.LENGTH_LONG).show();
            }
        });

    }
}
