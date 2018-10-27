package com.example.changetotemperature;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.changetotemperature.R;
import com.example.changetotemperature.Body;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button c_to_f = findViewById(R.id.button);
        c_to_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.editText);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);

                final TextView output = findViewById(R.id.textView);

                String show = Integer.toString(body.tranform_c_to_f());
                output.setText(show);
            }
        });

        Button f_to_c = findViewById(R.id.button2);
        f_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.editText);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);

                final TextView output = findViewById(R.id.textView);

                String show = String.format("%.2f", body.tranform_f_to_c());
                output.setText(show);
            }
        });
    }
}