package com.ridho.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText edtnama, edtgolongan;
TextView txtnama, txtgolongan, txtGajipokok, txttunjangan, txtpajak, txtgajibersih;
Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnama = (EditText) findViewById(R.id.edtnama);
        edtgolongan = (EditText) findViewById(R.id.edtgolongan);
        txtnama = (TextView) findViewById(R.id.txtnama);
        txtgolongan = (TextView) findViewById(R.id.txtgolongan);
        txtGajipokok = (TextView) findViewById(R.id.txtGajipokok);
        txttunjangan = (TextView) findViewById(R.id.txttunjangan);
        txtpajak = (TextView) findViewById(R.id.txtpajak);
        txtgajibersih = (TextView) findViewById(R.id.txtgajibersih);
        btnsubmit = (Button) findViewById(R.id.btnSubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama, golongan;
                double Gajipokok = 0, tunjangan = 0, pajak = 0, gajibersih;

                nama = edtnama.getText().toString();
                golongan = edtgolongan.getText().toString();

                if (golongan.equals("1")) {
                    Gajipokok = 1500000;
                    tunjangan = 1000000;
                    pajak = (Gajipokok + tunjangan) * 0.01;
                }else if (golongan.equals("2")) {
                    Gajipokok = 2000000;
                    tunjangan = 1500000;
                    pajak = (Gajipokok + tunjangan) * 0.02;
                }else if (golongan.equals("3")) {
                    Gajipokok = 2500000;
                    tunjangan = 2000000;
                    pajak = (Gajipokok + tunjangan) * 0.03;
                }else if (golongan.equals("4")) {
                    Gajipokok = 3000000;
                    tunjangan = 2500000;
                    pajak = (Gajipokok + tunjangan) * 0.04;
                }
                gajibersih = Gajipokok + tunjangan - pajak;

                String strnama = edtnama.getText().toString();
                String strgolongan = edtgolongan.getText().toString();

                txtnama.setText("Nama Karyawan: " + strnama);
                txtgolongan.setText("Golongan: " + strgolongan);
                txtGajipokok.setText("Gaji Pokok: " +String.valueOf(Gajipokok));
                txttunjangan.setText("Tunjangan: " +String.valueOf(tunjangan));
                txtpajak.setText("Pajak: " +String.valueOf(pajak));
                txtgajibersih.setText("Gaji Bersih: " +String.valueOf(gajibersih));


            }
        });

    }
}