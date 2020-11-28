package com.example.frofilpahlawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKemerdekaan,btnRevolusi;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKemerdekaan = findViewById(R.id.btn_buka_ras_nasional);
        btnRevolusi = findViewById(R.id.btn_buka_ras_revolusi);
        btnKemerdekaan.setOnClickListener(view -> bukaGaleri("Kemerdekaan"));
        btnRevolusi.setOnClickListener(view -> bukaGaleri("Revolusi"));

    }


    private void bukaGaleri(String kategoriPahlawan) {
        Log.d("MAIN","Buka activity Kemerdekaan");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, kategoriPahlawan);
        startActivity(intent);
    }

}