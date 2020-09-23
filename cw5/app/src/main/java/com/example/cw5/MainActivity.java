package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button x = findViewById(R.id.nextPage);
        final EditText y = findViewById(R.id.name);
        final EditText z = findViewById(R.id.age);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = y.getText().toString();
                String age = z.getText().toString();

                Intent i = new Intent(MainActivity.this , MainActivity2.class);
                i.putExtra("n", name);
                i.putExtra("a", age);
                startActivity(i);



            }
        });

    }
}