package uzi.media.smk.lessons.lessons1.fragment.materi.elementpenyangga.isielemenpenyangga;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uzi.media.smk.R;

/**
 * Created by fauzi sholichin on 02/12/17.
 * Email : fauzisholichin@gmail.com
 */

public class Pegas extends Fragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pegas, container, false);
        return v;
    }
}
