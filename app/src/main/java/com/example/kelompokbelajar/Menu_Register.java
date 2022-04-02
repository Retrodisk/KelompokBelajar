package com.example.kelompokbelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menu_Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_register);

        EditText editNim2 = findViewById(R.id.edt_nim2);
        EditText editNama = findViewById(R.id.edt_nama);
        EditText editAngkatan = findViewById(R.id.edt_angkatan);
        Button buttonSimpan = findViewById(R.id.btn_simpan);

        buttonSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nim2 = editNim2.getText().toString();
                String nama = editNama.getText().toString();
                String angkatan = editAngkatan.getText().toString();

                Intent intent2 = new Intent(Menu_Register.this,Data_Himti.class);
                intent2.putExtra("NIM",nim2);
                intent2.putExtra("NAMALENGKAP",nama);
                intent2.putExtra("ANGKATAN",angkatan);
                startActivity(intent2);

            }
        });

    }
}