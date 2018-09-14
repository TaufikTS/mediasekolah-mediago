package uzi.media.smk.lessons.lessons1.fragment.materi.statikadantegangan.isistatikadantegangan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uzi.media.smk.R;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengatar.isipengantar.elementmesin.FirstFragment;

/**
 * Created by uzi on 27/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class Momen extends Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_momen, container, false);
        return v;
    }
}
