package com.example.pradnyadevadiga.vasooli;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    TextView txt_splitbillFull,txt_splitbillPartial,txt_history,txt_changepin,txt_deleteaccount,txt_logout;
    Button btn_premium;
    Intent intent;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        
        txt_splitbillFull = (TextView)findViewById(R.id.txt_splitbillfull);
        txt_splitbillPartial = (TextView)findViewById(R.id.txt_splitbillpartial);
        txt_history = (TextView)findViewById(R.id.txt_history);
        txt_changepin =(TextView)findViewById(R.id.txt_changepin);
        txt_deleteaccount =(TextView)findViewById(R.id.txt_deleteaccount);
        txt_logout =(TextView)findViewById(R.id.txt_logout);
        btn_premium = (Button)findViewById(R.id.btn_upgrade);


        txt_splitbillFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Settings.this,SplitBillFull.class);
                startActivity(intent);
            }
        });

        txt_splitbillPartial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Settings.this,SplitBillPartial.class);
                startActivity(intent);
            }
        });

        txt_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Settings.this,History.class);
                startActivity(intent);
            }
        });

        txt_changepin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Settings.this,ChangePin.class);
                startActivity(intent);
            }
        });

        txt_deleteaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Settings.this,DeleteAccount.class);
                startActivity(intent);
            }
        });

        txt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Settings.this,Login.class);
                startActivity(intent);
            }
        });

        btn_premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Settings.this,AddVasooli.class);
                startActivity(intent);
            }
        });
    }
}
