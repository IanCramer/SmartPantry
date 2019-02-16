package com.example.foodster;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ThreehalfActivity extends AppCompatActivity {
FloatingActionButton fab;
DatabaseReference databasenin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threehalf);
fab=(FloatingActionButton)findViewById(R.id.fab);

databasenin= FirebaseDatabase.getInstance().getReference("food");



fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent dash=getIntent();
        Intent i=new Intent(ThreehalfActivity.this,FourthActivity.class);
        startActivity(i);
    }
});
        Intent you=getIntent();
        String fluff=you.getStringExtra("nin");
        //Toast.makeText(ThreehalfActivity.this, fluff, Toast.LENGTH_SHORT).show();
databasenin.push();
    }
}
