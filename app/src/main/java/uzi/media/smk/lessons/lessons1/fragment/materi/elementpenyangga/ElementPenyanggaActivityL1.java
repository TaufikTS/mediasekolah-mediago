package uzi.media.smk.lessons.lessons1.fragment.materi.elementpenyangga;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import uzi.media.smk.R;
import uzi.media.smk.lessons.lessons1.fragment.materi.elementpenyangga.isielemenpenyangga.Bantalan;
import uzi.media.smk.lessons.lessons1.fragment.materi.elementpenyangga.isielemenpenyangga.Pegas;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengatar.isipengantar.ElemenMesin;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengatar.isipengantar.PengertianElemenMesin;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengatar.isipengantar.StatikaDanTegangan;

/**
 * Created by uzi on 27/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class ElementPenyanggaActivityL1 extends AppCompatActivity {

    private ViewPager mPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        initView();
    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle(R.string.nav_pengantar);
            ab.setDisplayHomeAsUpEnabled(true);
        }
        mPager = (ViewPager) findViewById(R.id.pager);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);

        mPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));
        mTabLayout.setupWithViewPager(mPager);


    }

    class TabsAdapter extends FragmentPagerAdapter {

        public TabsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new Pegas();
                case 1:
                    return new Bantalan();

            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "PEGAS";
                case 1:
                    return "BANTALAN";
            }
            return "";
        }
    }

}
