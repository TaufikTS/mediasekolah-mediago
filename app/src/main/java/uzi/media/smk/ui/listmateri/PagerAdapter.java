package uzi.media.smk.ui.listmateri;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabMateriX tab1 = new TabMateriX();
                return tab1;
            case 1:
                TabMateriXI tab2 = new TabMateriXI();
                return tab2;
            case 2:
                TabMateriXII tab3 = new TabMateriXII();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
