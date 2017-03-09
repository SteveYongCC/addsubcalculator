package com.example.w10nkr.addsubcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    //step1 : create all the variables.
    EditText et1, et2, et3;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step2 : get all the views from xml file.
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);

        //step3 : write add functionality.
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = et1.getText().toString();
                int i = Integer.parseInt(f);
                String s = et2.getText().toString();
                int j = Integer.parseInt(s);

                Integer result = i+j;
                String res = result.toString();
                et3.setText(res);
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = et1.getText().toString();
                int i = Integer.parseInt(f);
                String s = et2.getText().toString();
                int j = Integer.parseInt(s);

                Integer result = i-j;
                String res = result.toString();
                et3.setText(res);
            }
        });

    }
}
