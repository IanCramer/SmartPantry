package com.example.foodster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
TextView tv1,tv2;
Button btnSubmit;
EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent1=getIntent();
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eml=et1.getText().toString();
                String pw=et2.getText().toString();

if(eml.equals("janedoe@gmail.com") && pw.equals("jane")) {
    Intent i = new Intent(ThirdActivity.this, ThreehalfActivity.class);
//String msg="John";

//i.putExtra("km",msg);
    startActivity(i);


}
else{
    Toast.makeText(ThirdActivity.this, "Please enter valid Email/Password", Toast.LENGTH_SHORT).show();
}


            }



            }

        );


    }
}
