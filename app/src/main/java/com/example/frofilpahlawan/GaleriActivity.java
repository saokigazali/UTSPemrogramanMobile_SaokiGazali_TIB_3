package com.example.frofilpahlawan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.frofilpahlawan.Model.Pahlawan;

import java.util.List;

public class GaleriActivity extends AppCompatActivity {

    List<Pahlawan> pahlawans;
    int indeksTampil = 0;
    String kategoriPahlawaan;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txNama,txAsal,txDeskripsi,txJudul;
    ImageView ivFotoPahlawan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_res);
        Intent intent = getIntent();
        kategoriPahlawaan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        pahlawans = DataProvider.getPahlawansByTipe(this,kategoriPahlawaan);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> Pertama());
        btnTerakhir.setOnClickListener(view -> Terakhir());
        btnSebelumnya.setOnClickListener(view -> Sebelumnya());
        btnBerikutnya.setOnClickListener(view -> Berikutnya());

        txNama = findViewById(R.id.txNama);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoPahlawan = findViewById(R.id.gambarPahlawan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Pahlawan"+kategoriPahlawaan);
        txNama = findViewById(R.id.txNama);
        txNama.setText(""+txNama);

    }
    @SuppressLint("NewApi")
    private void tampilkanProfil() {
        Pahlawan k = pahlawans.get(indeksTampil);
        Log.d("Nasional","Menampilkan Pahlawan Nasional "+k.getKategori());
        txNama.setText(k.getNama());
        txAsal.setText(k.getAsal());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoPahlawan.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void Pertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void Terakhir() {
        int posAkhir = pahlawans.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void Berikutnya() {
        if (indeksTampil == pahlawans.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void Sebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}
