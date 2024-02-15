package com.example.latihanandroidxpplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    EditText txtangka1;
    EditText txtangka2;
    Spinner spoperator;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        txtangka1 = findViewById(R.id.angka1);
        txtangka2 = findViewById(R.id.angka2);
        spoperator = findViewById(R.id.oprasispiner);
        tvHasil = findViewById(R.id.hasil);
        btnHitung = findViewById(R.id.htung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = spoperator.getSelectedItem().toString();
                int angkaa1 = Integer.parseInt(txtangka1.getText().toString());
                int angkaa2 = Integer.parseInt(txtangka2.getText().toString());
                int hasil = 0;
                switch (text){
                    case"Tambah":
                        hasil = angkaa1+angkaa2;
                        tvHasil.setText(String.valueOf(hasil));
                        break;

                    case"Kurang":
                        hasil = angkaa1-angkaa2;
                        tvHasil.setText(String.valueOf(hasil));
                        break;

                    case"Kali":
                        hasil = angkaa1*angkaa2;
                        tvHasil.setText(String.valueOf(hasil));
                        break;

                    case"bagi":
                        double hasilbg = (double)angkaa1 /(double) angkaa2;
                        tvHasil.setText(String.valueOf(hasilbg));
                        break;
                }

            }
        });



    }
}