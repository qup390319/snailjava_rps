package com.example.snailjava_rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login=(Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(btn_lobinListner);

    }
    private Button.OnClickListener btn_lobinListner=new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, MainPage.class);
            startActivity(intent);
        }
    };

}