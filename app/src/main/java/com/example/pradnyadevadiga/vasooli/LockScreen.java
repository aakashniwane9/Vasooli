package com.example.pradnyadevadiga.vasooli;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LockScreen extends AppCompatActivity {

    Button btngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_screen);

        btngo=(Button)findViewById(R.id.btn_go);


        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LockScreen.this, MainPage.class);
                startActivity(intent);
            }
        });



    }
}
