package com.example.excercise2_bt4;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2,t3;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView) findViewById(R.id.tv_name);
        t2=(TextView) findViewById(R.id.tv_email);
        t3=(TextView) findViewById(R.id.tv_project);
        b2=(Button) findViewById(R.id.btn_finish);

        Bundle bundle=getIntent().getExtras();

        if(bundle !=null) {
            String name = bundle.getString("name");
            String email = bundle.getString("email");
            String project = bundle.getString("project");

            t1.setText(name);
            t2.setText(email);
            t3.setText(project);
        }

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

