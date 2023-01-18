package com.example.dealer_honda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Bill extends AppCompatActivity {
    //untuk buat objek dari kelas DataHelper.java
    DataHelper dataHelper = new DataHelper(com.example.dealer_honda.Bill.this);
    //untuk menyimpan nilai string
    private String xnama;
    private String xalamat;
    private String xtelpon;
    private String xproduk;
    private String xukuran;
    private String xjumlah;
    private String xharga;
    private String xtotal;

    RadioGroup pilihproduk;
    int harga=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        //menghubungkan antara variable bill.java dengan id activity_pembelian_baju
        final EditText nama = (EditText) findViewById(R.id.nama);
        final EditText alamat = (EditText) findViewById(R.id.alamat);
        final EditText telepon = (EditText) findViewById(R.id.telepon);
        pilihproduk = (RadioGroup) findViewById(R.id.pilihproduk);
        final EditText ukuran = (EditText) findViewById(R.id.ukuran);
        final EditText jumlah = (EditText) findViewById(R.id.jumlah);
        final Button buy = (Button) findViewById(R.id.buy);
        //untuk memberikan pilihan nilai
        pilihproduk.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.produk1:
                        harga = 17465000;
                        break;
                    case R.id.produk2:
                        harga = 17280000;
                        break;
                    case R.id.produk3:
                        harga = 20400000;
                        break;
                    case R.id.produk4:
                        harga = 21000000;
                        break;
                    case R.id.produk5:
                        harga = 24550000;
                        break;
                    case R.id.produk6:
                        harga = 34300000;
                        break;
                    case R.id.produk7:
                        harga = 36000000;
                        break;
                    case R.id.produk8:
                        harga = 64000000;
                        break;
                    case R.id.produk9:
                        harga = 20000000;
                        break;
                    case R.id.produk10:
                        harga = 29000000;
                        break;
                    case R.id.produk11:
                        harga = 37000000;
                        break;
                    case R.id.produk12:
                        harga = 40000000;
                        break;
                    case R.id.produk13:
                        harga = 35000000;
                        break;
                    case R.id.produk14:
                        harga = 27450000;
                        break;
                    case R.id.produk15:
                        harga = 32650000;
                        break;
                    case R.id.produk16:
                        harga = 80000000;
                        break;
                    case R.id.produk17:
                        harga = 45000000;
                        break;
                    case R.id.produk18:
                        harga = 27340000;
                        break;
                    case R.id.produk19:
                        harga = 44000000;
                        break;
                    case R.id.produk20:
                        harga = 17433000;
                        break;
                }
            }
        });
        //menentukan aksi ketika button buy diklik
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdata = new Intent(getApplicationContext(), Checkout.class);
                //mengirim data menuju activity_pembelian_baju
                Bundle b = new Bundle();
                b.putString("nama", nama.getText().toString());
                b.putString("alamat", alamat.getText().toString());
                b.putString("telepon", telepon.getText().toString());
                b.putString("ukuran", ukuran.getText().toString());
                b.putString("jumlah", jumlah.getText().toString());
                int pilih_produk = pilihproduk.getCheckedRadioButtonId();
                RadioButton rbproduk = (RadioButton) findViewById(pilih_produk);
                b.putString("produk", rbproduk.getText().toString());
                b.putString("harga", String.valueOf(harga));
                int jumlahbeli = Integer.parseInt(jumlah.getText().toString());
                int total = harga*jumlahbeli;
                b.putString("total", String.valueOf(total));
                intentdata.putExtras(b);
                //menyimpan hasil input di string
                xnama = nama.getText().toString();
                xalamat = alamat.getText().toString();
                xtelpon = telepon.getText().toString();
                xproduk = rbproduk.getText().toString();
                xukuran = ukuran.getText().toString();
                xjumlah =  jumlah.getText().toString();
                xharga = String.valueOf(harga);
                xtotal =  String.valueOf(total);
                //menambah data tersimpan ke string tabel_cloth
                dataHelper.tambah_cloth(xnama, xalamat, xtelpon, xproduk ,xukuran, xjumlah, xharga, xtotal);
                startActivity(intentdata);
                finish();
            }
        });
    }
}