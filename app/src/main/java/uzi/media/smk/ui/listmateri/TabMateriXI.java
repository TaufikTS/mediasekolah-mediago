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

public class TabMateriXI extends Fragment implements ListMateriListener {

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
                add(new Materi("Perawatan Mesin Secara Berkala", 1,R.mipmap.ic_14));
                add(new Materi("Memahami dan Memelihara Unit Kopling", 2,R.mipmap.ic_19));
                add(new Materi("Memelihara Transmisi", 3,R.mipmap.ic_20));
                add(new Materi("Memelihara Unit Final Drive/Gardan", 4,R.mipmap.ic_21));
                add(new Materi("Memperbaiki Sistem Kelistrikan, Pengaman, dan Kelengkapan Tambahan", 5,R.mipmap.ic_29));
                add(new Materi("Memperbaiki Sistem Pengapian Konvensional", 6,R.mipmap.ic_30));
                add(new Materi("Memperbaiki Sistem Bahan Bakar Bensin", 7,R.mipmap.ic_16));
                add(new Materi("Memelihara Poros Penggerak Roda", 8,R.mipmap.ic_22));
                add(new Materi("Memperbaiki Rem dan Anti-Lock Braking System (ABS)", 9,R.mipmap.ic_24));
                add(new Materi("Pemeliharaan Sistem Kemudi", 10,R.mipmap.ic_25));
                add(new Materi("Memperbaiki Sistem Starter", 11,R.mipmap.ic_31));
                add(new Materi("Memperbaiki SIstem Pengisian", 12,R.mipmap.ic_32));
            }
        };
        adapter.setPelajaran(listMateri);
        rvList.setAdapter(adapter);
    }

    @Override
    public void onClick(Materi materi) {
        if(materi.getId()==1){
            Toast.makeText(getActivity(), "Meteri sedang di kembangkan", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getActivity(), "Meteri sedang di kembangkan", Toast.LENGTH_SHORT).show();
        }
    }
}