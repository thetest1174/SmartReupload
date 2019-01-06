package com.example.smart22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private EditText inputt;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        inputt = (EditText) findViewById(R.id.the_input);
        //if(inputt.getText().length() != 13) text = "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก";
        button = (Button) findViewById(R.id.the_button);button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast toast = Toast.makeText(Main3Activity.this,text,toast.LENGTH_SHORT);
                toast.show();*/
            }
        });
    }
}
