package com.example.dealer_honda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailPembelian extends AppCompatActivity {
    //membuat objek dari DataHelper.java
    DataHelper dataHelper = new DataHelper(this);
    //digunakan untuk menampung nilai string
    private String xnama;
    private String xalamat;
    private String xtelpon;
    private String xproduk;
    private String xukuran;
    private String xjumlah;
    private String xharga;
    private String xtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pembelian);
        //untuk menyambung variable detailpembelian.java dengan id activity pembelian_baju
        TextView nama = (TextView) findViewById(R.id.textnama);
        TextView alamat = (TextView) findViewById(R.id.textalamat);
        TextView telpon = (TextView) findViewById(R.id.texttelepon);
        TextView produk = (TextView) findViewById(R.id.textproduk);
        TextView ukuran = (TextView) findViewById(R.id.textukuran);
        TextView jumlah = (TextView) findViewById(R.id.textjumlah);
        TextView harga = (TextView) findViewById(R.id.textharga);
        TextView total = (TextView) findViewById(R.id.texttotal);
        Button edit = (Button) findViewById(R.id.edit);
        Button hapus = (Button) findViewById(R.id.hapus);
        //string digunakan untuk menampung data dari Bill
        Bundle extras = getIntent().getExtras();
        xnama = extras.getString("nama");
        xalamat = extras.getString("alamat");
        xtelpon = extras.getString("telpon");
        xproduk = extras.getString("produk");
        xukuran = extras.getString("ukuran");
        xjumlah = extras.getString("jumlah");
        xharga = extras.getString("harga");
        xtotal = extras.getString("total");
        //hasil dari string akan dimasukan ke TextView
        nama.setText(xnama);
        alamat.setText(xalamat);
        telpon.setText(xtelpon);
        produk.setText(xproduk);
        ukuran.setText(xukuran);
        jumlah.setText(xjumlah);
        harga.setText(xharga);
        total.setText(xtotal);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kirim = new Intent(getApplicationContext(), EditPembelian.class);
                kirim.putExtra("nama", xnama);
                kirim.putExtra("alamat", xalamat);
                kirim.putExtra("telpon", xtelpon);
                kirim.putExtra("produk", xproduk);
                kirim.putExtra("ukuran", xukuran);
                kirim.putExtra("jumlah", xjumlah);
                kirim.putExtra("harga", xharga);
                kirim.putExtra("total", xtotal);
                startActivity(kirim);
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHelper.hapus_barang(xnama);
                Intent data = new Intent(getApplicationContext(), PembelianMotor.class);
                startActivity(data);
                finish();
            }
        });
    }
}