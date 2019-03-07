package com.example.simpleui;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstName   = findViewById(R.id.firstName);
        final EditText lastName   = findViewById(R.id.lastName);


        final Button button = findViewById(R.id.sendButton);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String last = lastName.getText().toString();
                String first = firstName.getText().toString();
                Toast.makeText( MainActivity.this,"Congratulation " + last + " " + first ,Toast.LENGTH_SHORT ).show();
            }
        });

    }
}
