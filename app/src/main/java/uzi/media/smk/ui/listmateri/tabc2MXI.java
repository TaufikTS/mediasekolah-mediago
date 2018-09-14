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

public class tabc2MXI extends Fragment implements ListMateriListener {

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

                add(new Materi("Dasar-Dasar Budidaya Tanaman", 1, R.mipmap.ic_atph));
                add(new Materi("Alat Mesin Pertanian", 2, R.mipmap.ic_atph));
                add(new Materi("Pembiakan Tanaman", 3, R.mipmap.ic_atph));
            }
        };
        adapter.setPelajaran(listMateri);
        rvList.setAdapter(adapter);
    }

    @Override
    public void onClick(Materi materi) {
        if (materi.getId() == 3) {
            startActivity(new Intent(getActivity(), LessonsActivity.class));
        } else {
            Toast.makeText(getActivity(), "Meteri sedang di kembangkan", Toast.LENGTH_SHORT).show();
        }
    }
}