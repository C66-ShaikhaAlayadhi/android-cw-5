package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name = findViewById(R.id.textView);

        Bundle S = getIntent().getExtras();
        String H = S.getString("n");
        String W = S.getString("a");

        TextView age = findViewById(R.id.textView2);


        name.setText(H);
        age.setText(W);

        Button Back = findViewById(R.id.button);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent J = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(J);
            }
        });
    }
}