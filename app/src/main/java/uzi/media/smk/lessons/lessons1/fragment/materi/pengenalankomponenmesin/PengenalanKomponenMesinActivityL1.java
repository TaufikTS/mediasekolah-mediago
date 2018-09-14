package uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.greenrobot.eventbus.Subscribe;

import uzi.media.smk.R;
import uzi.media.smk.lessons.lessons1.event.GlobalBus;
import uzi.media.smk.lessons.lessons1.event.VideoEvents;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengatar.isipengantar.ElemenMesin;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengatar.isipengantar.PengertianElemenMesin;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengatar.isipengantar.StatikaDanTegangan;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.BlokSilinder;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.FlyWheel;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.KepalaSilinder;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.PistonDanBatangPiston;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.PorosEngkol;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.RockerArm;

/**
 * Created by uzi on 27/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class PengenalanKomponenMesinActivityL1 extends AppCompatActivity {

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
            ab.setTitle(R.string.nav_pengenalan_komponen_mesin);
            ab.setDisplayHomeAsUpEnabled(true);
        }
        mPager = (ViewPager) findViewById(R.id.pager);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);

        mPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));
        mTabLayout.setupWithViewPager(mPager);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                VideoEvents.ActivityFragmentMessage activityFragmentMessageEvent =
                        new VideoEvents.ActivityFragmentMessage(String.valueOf("cekkk"));
                GlobalBus.getBus().post(activityFragmentMessageEvent);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    class TabsAdapter extends FragmentPagerAdapter {

        public TabsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new KepalaSilinder();
                case 1:
                    return new BlokSilinder();
                case 2:
                    return new PistonDanBatangPiston();
                case 3:
                    return new PorosEngkol();
                case 4:
                    return new FlyWheel();
                case 5:
                    return new RockerArm();

            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "KEPALA SILINDER";
                case 1:
                    return "BLOK SILINDER";
                case 2:
                    return "PISTON DAN BATANG PISTON";
                case 3:
                    return "POROS ENGKOL";
                case 4:
                    return "FLY WHEEL";
                case 5:
                    return "ROCKER ARM";
            }
            return "";
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        GlobalBus.getBus().register(this);
    }

    @Subscribe
    public void getMessage(VideoEvents.FragmentActivityMessage fragmentActivityMessage) {

    }

    @Override
    protected void onPause() {
        super.onPause();
        GlobalBus.getBus().unregister(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        GlobalBus.getBus().unregister(this);
    }

}
