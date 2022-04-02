package com.example.kelompokbelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Data_Himti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_himti);

        TextView txtNim2 = findViewById(R.id.txt_nim);
        TextView txtNama = findViewById(R.id.txt_nama);
        TextView txtAngkatan = findViewById(R.id.txt_angkatan);

        Intent intent = getIntent();
        String hasilNim2 = intent.getStringExtra("NIM");
        String hasilNama = intent.getStringExtra("NAMALENGKAP");
        String hasilAngkatan = intent.getStringExtra("ANGKATAN");

        txtNim2.setText(hasilNim2);
        txtNama.setText(hasilNama);
        txtAngkatan.setText(hasilAngkatan);

    }
}