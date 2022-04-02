package com.example.kelompokbelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.form_login);

        EditText editNim = findViewById(R.id.edt_nim);
        EditText editPassword = findViewById(R.id.edt_password);
        Button buttonLogin = findViewById(R.id.btn_login);
        Button buttonRegister = findViewById(R.id.btn_register);
        TextView txtLupaPass = findViewById(R.id.txt_dua);
        ImageView showPass = findViewById(R.id.showPassword);
        ImageView hidePass = findViewById(R.id.hidePassword);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,Menu_Register.class);
                startActivity(intent);
            }
        });

        showPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                hidePass.setVisibility(View.VISIBLE);
                showPass.setVisibility(View.GONE);
            }
        });

        hidePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                hidePass.setVisibility(View.GONE);
                showPass.setVisibility(View.VISIBLE);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nim = editNim.getText().toString();
                String password = editPassword.getText().toString();

                Intent intent = new Intent(LoginActivity.this,Menu_Utama.class);
                intent.putExtra("NIM",nim);
                intent.putExtra("PASSWORD",password);
                startActivity(intent);
            }
        });

        txtLupaPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Maaf Fitur Lupa Password masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
            }
        });


    }
}

//Java = case sensitif