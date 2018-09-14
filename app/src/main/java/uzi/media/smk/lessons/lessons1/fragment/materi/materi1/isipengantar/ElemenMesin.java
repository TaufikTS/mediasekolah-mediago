package uzi.media.smk.lessons.lessons1.fragment.materi.materi1.isipengantar;

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
import uzi.media.smk.lessons.lessons1.fragment.materi.materi1.isipengantar.elementmesin.FirstFragment;

/**
 * Created by uzi on 27/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class ElemenMesin extends Fragment {
    private ViewPager VpElement;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        VpElement = (ViewPager)view.findViewById(R.id.VpElement);
        VpElement.setAdapter(new MyPagerAdapter(getChildFragmentManager()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_elemen_mesin_l1, container, false);
        return v;
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return FirstFragment.newInstance("a. Elemen Sambungan","Gambar : Simbol Mur dan Simbol Baut",R.drawable.pengantar1_2);
                case 1:
                    return FirstFragment.newInstance("b. Elemen Transmisi","Gambar : Poros", R.drawable.pengantar1_3);
                case 2:
                    return FirstFragment.newInstance("c. Elemen Penyangga","Gambar : Bantalan", R.drawable.pengantar1_4);
                default:
                    return FirstFragment.newInstance("","ThirdFragment, Default", R.drawable.voip);
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
