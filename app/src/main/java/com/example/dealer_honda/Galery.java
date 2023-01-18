package com.example.dealer_honda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Galery extends AppCompatActivity {
    //deklarasi variable baru
    ImageView pic1;
    ImageView pic2;
    ImageView pic3;
    ImageView pic4;
    ImageView pic5;
    ImageView pic6;
    ImageView pic7;
    ImageView pic8;
    ImageView pic9;
    ImageView pic10;
    ImageView pic11;
    ImageView pic12;
    ImageView pic13;
    ImageView pic14;
    ImageView pic15;
    ImageView pic16;
    ImageView pic17;
    ImageView pic18;
    ImageView pic19;
    ImageView pic20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        //untuk menghubungkan galery.java dengan id activity_pembelian_baju
        pic1 = (ImageView) findViewById(R.id.pic1);
        pic2 = (ImageView) findViewById(R.id.pic2);
        pic3 = (ImageView) findViewById(R.id.pic3);
        pic4 = (ImageView) findViewById(R.id.pic4);
        pic5 = (ImageView) findViewById(R.id.pic5);
        pic6 = (ImageView) findViewById(R.id.pic6);
        pic7 = (ImageView) findViewById(R.id.pic7);
        pic8 = (ImageView) findViewById(R.id.pic8);
        pic9 = (ImageView) findViewById(R.id.pic9);
        pic10 = (ImageView) findViewById(R.id.pic10);
        pic11 = (ImageView) findViewById(R.id.pic11);
        pic12 = (ImageView) findViewById(R.id.pic12);
        pic13 = (ImageView) findViewById(R.id.pic13);
        pic14 = (ImageView) findViewById(R.id.pic14);
        pic15 = (ImageView) findViewById(R.id.pic15);
        pic16 = (ImageView) findViewById(R.id.pic16);
        pic17 = (ImageView) findViewById(R.id.pic17);
        pic18 = (ImageView) findViewById(R.id.pic18);
        pic19 = (ImageView) findViewById(R.id.pic19);
        pic20 = (ImageView) findViewById(R.id.pic20);

        //untuk menghubungkan pic pertama dengan detail.java
        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail.class);
                startActivity(intent);
            }
        });
        //untuk menghubungkan pic kedua dengan detail2.java
        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail2.class);
                startActivity(intent);
            }
        });
        //untuk menghubungkan pic ketiga dengan detail3.java
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail3.class);
                startActivity(intent);
            }
        });
        //untuk menghubungkan pic keempat dengan detail4.java
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail4.class);
                startActivity(intent);
            }
        });
        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail5.class);
                startActivity(intent);
            }
        });
        pic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail6.class);
                startActivity(intent);
            }
        });
        pic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail7.class);
                startActivity(intent);
            }
        });
        pic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail8.class);
                startActivity(intent);
            }
        });
        pic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail9.class);
                startActivity(intent);
            }
        });
        pic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail10.class);
                startActivity(intent);
            }
        });
        pic11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail11.class);
                startActivity(intent);
            }
        });
        pic12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail12.class);
                startActivity(intent);
            }
        });
        pic13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail13.class);
                startActivity(intent);
            }
        });
        pic14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail14.class);
                startActivity(intent);
            }
        });
        pic15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail15.class);
                startActivity(intent);
            }
        });
        pic16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail16.class);
                startActivity(intent);
            }
        });
        pic17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail17.class);
                startActivity(intent);
            }
        });
        pic18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail18.class);
                startActivity(intent);
            }
        });
        pic19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail19.class);
                startActivity(intent);
            }
        });
        pic20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this, Detail20.class);
                startActivity(intent);
            }
        });

    }
}
