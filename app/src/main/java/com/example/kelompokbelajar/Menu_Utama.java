package com.example.kelompokbelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Menu_Utama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        TextView txtNim = findViewById(R.id.edt_nim);
        TextView txtPassword = findViewById(R.id.edt_password);

        Intent intent = getIntent();
        String hasilNim = intent.getStringExtra("NIM");
        String hasilPass = intent.getStringExtra("PASSWORD");

        txtNim.setText(hasilNim);
        txtPassword.setText(hasilPass);


    }
}