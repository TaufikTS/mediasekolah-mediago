package uzi.media.smk.lessons.lessons1.fragment.kikd;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uzi.media.smk.R;

/**
 * Created by uzi on 26/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class KikdFragment extends Fragment {

    private ViewPager mPager;
    private TabLayout mTabLayout;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_kikd, container, false);
        mPager = (ViewPager) v.findViewById(R.id.pager);
        mTabLayout = (TabLayout) v.findViewById(R.id.tab_layout);

        mPager.setAdapter(new TabsAdapter(getChildFragmentManager()));
        mTabLayout.setupWithViewPager(mPager);

        setHasOptionsMenu(true);

        return v;
    }


    class TabsAdapter extends FragmentPagerAdapter {

        public TabsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new KiMateri();
                case 1:
                    return new KdMateri();
                case 2:
                    return new IndikatorMateri();

            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "KOMPETENSI INTI";
                case 1:
                    return "KOMPETENSI DASAR";
                case 2:
                    return "INDIKATOR";
            }
            return "";
        }
    }

}
