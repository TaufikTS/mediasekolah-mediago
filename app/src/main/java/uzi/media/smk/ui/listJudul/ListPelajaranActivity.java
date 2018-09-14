package uzi.media.smk.ui.listJudul;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import uzi.media.smk.R;
import uzi.media.smk.ui.listmateri.ListMateriMenu;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class ListPelajaranActivity extends AppCompatActivity implements ListInterface {
    private RecyclerView rvList;
    private ListPelajaranAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pelajaran);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListPelajaranActivity.this, ListMateriMenu.class));
            }
        });
        rvList = (RecyclerView) findViewById(R.id.rvRecycleview);
        rvList.setHasFixedSize(true);
        rvList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new ListPelajaranAdapter(this, this);
        List<Pelajaran> listPelajaran = new ArrayList<Pelajaran>() {
            {
                add(new Pelajaran("1.  Memahami Dasar-Dasar Mesin", 1));
                add(new Pelajaran("2.  Memahami Proses Dasar Pembentukan Logam", 1));
                add(new Pelajaran("3.  Menjelaskan Proses-Proses Mesin Konversi Energi", 1));
                add(new Pelajaran("4.  Menginterpretasikan Gambar Teknik", 1));
                add(new Pelajaran("5.  Menerapkan Sistem Hidrolik", 1));
                add(new Pelajaran("6.  Menggunakan Bearing, Seal, dan Gasket", 1));
                add(new Pelajaran("7.  Menggunakan Service Literature, Jacking, Blocking, dan Lifting", 1));
                add(new Pelajaran("8.  Menggunakan Peralatan dan Perlengkapan Perbaikan", 2));
                add(new Pelajaran("9.  Menggunakan Alat-Alat Ukur (Measuring Tools)", 2));
                add(new Pelajaran("10. Menerapkan Prosedur Keselamatan dan Kesehatan Kerja di LIngkungan Kerja", 2));
                add(new Pelajaran("11. Menerangkan, Menggunakan dan Merawat Baterai", 3));
                add(new Pelajaran("12. Mernerapkan Dasar Listrik", 3));
                add(new Pelajaran("13. Menerapkan Dasar Elektronika", 3));
                add(new Pelajaran("14. Perawatan Mesin Secara Berkala", 4));
                add(new Pelajaran("15. Overhaul Mekanisme Mesin", 4));
                add(new Pelajaran("16. Memperbaiki Sistem Bahan Bakar Bensin", 4));
                add(new Pelajaran("17. Memperbaiki SIstem Injeksi Bahan Bakaar Diesel", 4));
                add(new Pelajaran("18. Memelihara/Servis Sistem Common Rail Diesel", 4));
                add(new Pelajaran("19. Memahami dan Memelihara Unit Kopling", 5));
                add(new Pelajaran("20. Memelihara Transmisi", 5));
                add(new Pelajaran("21. Merawat Unit Final Drive/Gardan", 5));
                add(new Pelajaran("22. Memelihara Poros Penggerak Roda", 5));
                add(new Pelajaran("23. Memeperbaiki Roda dan Ban", 5));
                add(new Pelajaran("24. Memperbaiki Sistem Rem dan AntiLock Braking System", 5));
                add(new Pelajaran("25. Memperbaiki Sistem KEmudi", 5));
                add(new Pelajaran("26. Memahami dan Memelihara Sistem Suspensi", 5));
                add(new Pelajaran("27. Memelihara Sistem Transmisi Otomatis", 5));
                add(new Pelajaran("28. Memelihara Electrical Power Steering", 5));
                add(new Pelajaran("29. Memperbaiki Kerusakan RIngan pada Sistem Kelistrikan, Pengaman, dan Kelengkapan Tambahan", 6));
                add(new Pelajaran("30. memperbaiki Sistem Pengapian", 6));
                add(new Pelajaran("31. Memperbaiki Sistem Starter", 6));
                add(new Pelajaran("32. Memperbaiki Sistem Pengisian", 6));
                add(new Pelajaran("33. Memperbaiki Sistem Air Conditioning (AC)", 6));
                add(new Pelajaran("34. Memelihara/Servis Sistem Pengapian Elektronik", 6));
                add(new Pelajaran("35. Memelihara Engine Management System", 6));
                add(new Pelajaran("36. Memelihara Sistem Audio", 6));
                add(new Pelajaran("37. Memelihara Alarm, Central Lock, dan Power Window", 6));
            }
        };
        adapter.setPelajaran(listPelajaran);
        rvList.setAdapter(adapter);
    }

    @Override
    public void onClick(Pelajaran pelajaran) {
//        PelajaranDialog
//                .newInstance()
//                .show(getSupportFragmentManager(), "pelajaran");
    }
}
