package com.example.conversor_de_moeda;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity3 extends AppCompatActivity {
    private Switch meuSwitch;
    private Switch meuSwitch1;
    private Switch meuSwitch2;
    private Switch meuSwitch3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main3);

        meuSwitch = findViewById(R.id.sw_dollar);
        meuSwitch1 = findViewById(R.id.sw_real);
        meuSwitch2 = findViewById(R.id.sw_euro);
        meuSwitch3 = findViewById(R.id.sw_libra);

        meuSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (meuSwitch.isChecked()) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                    startActivity(intent);
                }}});
                meuSwitch1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (meuSwitch1.isChecked()) {
                            Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                            startActivity(intent);
                        }}});
                        meuSwitch2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (meuSwitch1.isChecked()) {
                                    Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                                    startActivity(intent);
                                }}});
                                meuSwitch3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (meuSwitch1.isChecked()) {
                                            Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                                            startActivity(intent);
                                        }}});

            }


}
