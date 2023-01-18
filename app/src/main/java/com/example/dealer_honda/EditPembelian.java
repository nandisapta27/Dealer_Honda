package com.example.dealer_honda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditPembelian extends AppCompatActivity {

    DataHelper dataHelper = new DataHelper(this);

    private String xnama;
    private String xalamat;
    private String xtelpon;
    private String xproduk;
    private String xukuran;
    private String xjumlah;
    private String xharga;
    private String xtotal;

    private TextView nama;
    private EditText alamat;
    private EditText telpon;
    private EditText produk;
    private EditText ukuran;
    private EditText jumlah;
    private EditText harga;
    private EditText total;

    private String enama;
    private String ealamat;
    private String etelpon;
    private String eproduk;
    private String eukuran;
    private int ejumlah;
    private int eharga;
    private int etotal;

    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_pembelian);

        nama = (TextView) findViewById(R.id.nama);
        alamat = (EditText) findViewById(R.id.alamat);
        telpon = (EditText) findViewById(R.id.telepon);
        produk = (EditText) findViewById(R.id.produk);
        ukuran = (EditText) findViewById(R.id.ukuran);
        jumlah = (EditText) findViewById(R.id.jumlah);
        harga = (EditText) findViewById(R.id.harga);
        total = (EditText) findViewById(R.id.total);
        simpan = (Button) findViewById(R.id.simpan);

        Bundle extras = getIntent().getExtras();
        xnama = extras.getString("nama");
        xalamat = extras.getString("alamat");
        xtelpon = extras.getString("telpon");
        xproduk = extras.getString("produk");
        xukuran = extras.getString("ukuran");
        xjumlah = extras.getString("jumlah");
        xharga = extras.getString("harga");
        xtotal = extras.getString("total");

        nama.setText(xnama);
        alamat.setText(xalamat);
        telpon.setText(xtelpon);
        produk.setText(xproduk);
        ukuran.setText(xukuran);
        jumlah.setText(xjumlah);
        harga.setText(xharga);
        total.setText(xtotal);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enama = nama.getText().toString();
                ealamat = alamat.getText().toString();
                etelpon = telpon.getText().toString();
                eproduk = produk.getText().toString();
                eukuran = ukuran.getText().toString();
                ejumlah = Integer.valueOf(jumlah.getText().toString());
                eharga = Integer.valueOf(harga.getText().toString());
                etotal = Integer.valueOf(total.getText().toString());

                dataHelper.update_barang(enama, ealamat, etelpon, eproduk, eukuran, ejumlah, eharga, etotal);

                Toast.makeText(EditPembelian.this, "Data " + xnama +" telah di update", Toast.LENGTH_SHORT).show();
                Intent tampil = new Intent(getApplicationContext(), PembelianMotor.class);
                startActivity(tampil);
                finish();
            }
        });
    }
}