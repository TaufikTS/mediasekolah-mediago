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

public class TabMateriXII extends Fragment implements ListMateriListener {

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
                add(new Materi("Overhaul Mekanisme Mesin", 1,R.mipmap.ic_15));
                add(new Materi("Memperbaiki SIstem Bahan Bakar Diesel", 2,R.mipmap.ic_17));
                add(new Materi("Memperbaiki Roda dan Ban", 3,R.mipmap.ic_23));
                add(new Materi("Memperbaiki Rem dan Anti-Lock Braking System (ABS)", 4,R.mipmap.ic_24));
                add(new Materi("Memahami dan Memelihara Sistem Suspensi", 5,R.mipmap.ic_26));
                add(new Materi("Memperbaiki Sistem Air Conditioning", 6,R.mipmap.ic_33));
                add(new Materi("Memelihara/Service Sistem Pengapian Elektronik", 7,R.mipmap.ic_34));
                add(new Materi("Memelihara Sistem Engine Management System (EMS)", 8,R.mipmap.ic_35));
                add(new Materi("Memelihara/Service Sistem COmmon Rail Diesel", 9,R.mipmap.ic_18));
                add(new Materi("Memelihara Sistem Transimis Otomatis", 10,R.mipmap.ic_27));
                add(new Materi("Memelihara Electrical Power Steering (EPS)", 11,R.mipmap.ic_28));
                add(new Materi("Memelihara Sistem Gasoline Direct Injection (GDI)", 12,R.mipmap.ic_36));
                add(new Materi("Memelihara Sistem Audio", 13,R.mipmap.ic_37));
                add(new Materi("Memelihara Alrm, Cetral Lock, dan Power Window", 14,R.mipmap.ic_38));
            }
        };
        adapter.setPelajaran(listMateri);
        rvList.setAdapter(adapter);
    }

    @Override
    public void onClick(Materi materi) {
        if (materi.getId() == 1) {
            Toast.makeText(getActivity(), "Meteri sedang di kembangkan", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "Meteri sedang di kembangkan", Toast.LENGTH_SHORT).show();
        }
    }
}