package uzi.media.smk.ui.listmateri;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uzi.media.smk.R;
import uzi.media.smk.lessons.lessons1.LessonsActivity;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class TabMateriX extends Fragment implements ListMateriListener {

    private RecyclerView rvList;
    private ListMateriAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_list_materi, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvList = (RecyclerView) view.findViewById(R.id.rvRecycleview);
        rvList.setHasFixedSize(true);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        adapter = new ListMateriAdapter(this);
        List<Materi> listMateri = new ArrayList<Materi>() {
            {

                add(new Materi("Memahami Dasar-Dasar Mesin", 1, R.mipmap.ic_1));
                add(new Materi("Memahami Proses Dasar Pembentukan Logam", 2, R.mipmap.ic_2));
                add(new Materi("Menjelaskan Proses-Proses Mesin Konveksi Energi", 3, R.mipmap.ic_3));
                add(new Materi("Menginterpretasikan Gambar Teknik", 4, R.mipmap.ic_4));
                add(new Materi("Menggunakan Peralatan Perlengkapan Perbaikan", 5, R.mipmap.ic_8));
                add(new Materi("Menerapkan Daftar Listrik", 6, R.mipmap.ic_12));
                add(new Materi("Menerapakan Dasar Elektronika", 7, R.mipmap.ic_13));
                add(new Materi("Menginterpretasikan Gambar Teknik", 4, R.mipmap.ic_4));
                add(new Materi("Menerapakan Sistem Hidrolik", 8, R.mipmap.ic_5));
                add(new Materi("Menggunakan Bearing, Seal, dan Gasket", 9, R.mipmap.ic_6));
                add(new Materi("Menggunakan Service Literature, Jacking, Blocking, dan Lifting", 7, R.mipmap.ic_7));
                add(new Materi("Menggunakan Alat-Alat Ukur (Measuring Tools)", 8, R.mipmap.ic_9));
                add(new Materi("Menerapakan Prosedur keselamatan Kerja dan Kesehatan Kerja di Lingkungan Kerja", 4, R.mipmap.ic_10));
                add(new Materi("Menerapkan dan Menggunakan Baterai", 9, R.mipmap.ic_11));
            }
        };
        adapter.setPelajaran(listMateri);
        rvList.setAdapter(adapter);
    }

    @Override
    public void onClick(Materi materi) {
        if (materi.getId() == 1) {
            startActivity(new Intent(getActivity(), LessonsActivity.class));
        } else {
            Toast.makeText(getActivity(), "Meteri sedang di kembangkan", Toast.LENGTH_SHORT).show();
        }
    }
}