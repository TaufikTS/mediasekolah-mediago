package uzi.media.smk.lessons.lessons1.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import uzi.media.smk.R;

/**
 * Created by uzi on 26/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class PengayaanFragment extends Fragment {


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_apersepsi, container, false);
        VideoView view = (VideoView) v.findViewById(R.id.vvApersepsi);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.apersepsi;
        view.setVideoURI(Uri.parse(path));
        view.start();
        return v;
    }
}
