package com.example.excercise2_bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.ed_name);
        e2=(EditText) findViewById(R.id.ed_email);
        e3=(EditText) findViewById(R.id.ed_project);
        b1=(Button) findViewById(R.id.btn_send);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("name",e1.getText().toString());
                intent.putExtra("email",e2.getText().toString());
                intent.putExtra("project",e3.getText().toString());

                startActivity(intent);
            }
        });


    }
}
