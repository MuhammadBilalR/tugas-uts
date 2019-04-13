package com.gmail.a0897.seventee17.tugasuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class masuk extends AppCompatActivity {
    ListView list;

    String[] maintitle = {
            "M Nur Assidiq", "Antonius J B W",
            "Emanuel Krowe G", "Mikael Dionito H",
            "Nurul Islamy Z", "Miftahul Ulum",
            "Rohmanto", "Danis Pangestu",
    };
    // TODO: Pendeklarasian Array String pada maintitle

    String[] subtitle = {
            "165410067", "165410095",
            "165410097", "165410102",
            "165410111", "165410117",
            "165410120", "165410156",
    };
    // TODO: Pendeklarasian Array String pada subtitle

    Integer[] imgid = {
            R.drawable.download_1, R.drawable.download_2,
            R.drawable.download_3, R.drawable.download_4,
            R.drawable.download_5, R.drawable.download_6,
            R.drawable.download_7, R.drawable.download_8,
    };
    // TODO: Penginisialisasi gambar pada drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        // TODO: Kondisi awal activity diciptakan yang dilakukan suatu inisialisasi pada activity_masuk
        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter((ListAdapter) adapter);
        // TODO: Class yang mengatur item-item pada ListView sesuai dengan id list

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if (position == 0) {
                    // TODO: code specific to first list item
                    Toast.makeText(getApplicationContext(), "Sidiq", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    // TODO: code specific to 2nd list item
                    Toast.makeText(getApplicationContext(), "Anton", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {

                    Toast.makeText(getApplicationContext(), "Emanuel", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {

                    Toast.makeText(getApplicationContext(), "Mikael", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {

                    Toast.makeText(getApplicationContext(), "Nurul", Toast.LENGTH_SHORT).show();
                } else if (position == 5) {

                    Toast.makeText(getApplicationContext(), "Ulum", Toast.LENGTH_SHORT).show();
                } else if (position == 6) {

                    Toast.makeText(getApplicationContext(), "Rohman", Toast.LENGTH_SHORT).show();
                } else if (position == 7) {

                    Toast.makeText(getApplicationContext(), "Danis", Toast.LENGTH_SHORT).show();
                }
                // TODO: Suatu kondisi untuk menampilkan pesan teks dengan menggunakan fungsi Toast

            }
        });
    }
}
