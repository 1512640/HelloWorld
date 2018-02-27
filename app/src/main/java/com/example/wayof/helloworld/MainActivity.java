package com.example.wayof.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edT1,edT2;
    Button bt;
    TextView tV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edT1 = (EditText)findViewById(R.id.editText1);
        edT2 = (EditText)findViewById(R.id.editText2);
        bt = (Button)findViewById(R.id.button);
        tV = (TextView)findViewById(R.id.textView);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edT1.getText().toString();
                int s1 = Integer.parseInt(chuoi1);
                String chuoi2 = edT2.getText().toString();
                int s2 = Integer.parseInt(chuoi2);
                int tong = s1 + s2;
                tV.setText(String.valueOf(tong));
            }
        });
    }
}
