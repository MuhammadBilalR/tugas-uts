package com.gmail.a0897.seventee17.tugasuts;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class registrasi extends AppCompatActivity {

    Button buttonok;
    // TODO: pendeklarasian button untuk kelas registrasi
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        // TODO: Kondisi awal activity diciptakan yang dilakukan suatu inisialisasi pada activity_registrasi

        buttonok = (Button) findViewById(R.id.buttonok);
        // TODO: pendeklarasian suatu variabel yang dilakukan view/widget sesuai id pada kelas xml

        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registrasi.this, MainActivity.class);
                registrasi.this.startActivity(intent);
                // TODO: Action intent pada button btnok yang diklik akan berpindah ke layout MainActivty
            }
        });
    }
}