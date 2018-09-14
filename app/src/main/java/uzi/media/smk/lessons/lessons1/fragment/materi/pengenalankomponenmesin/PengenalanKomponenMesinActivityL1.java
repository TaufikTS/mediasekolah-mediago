package uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin;

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

import org.greenrobot.eventbus.Subscribe;

import uzi.media.smk.R;
import uzi.media.smk.lessons.lessons1.event.GlobalBus;
import uzi.media.smk.lessons.lessons1.event.VideoEvents;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m10_teknik_pembuatan_media_tanam;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m11_sterilisasi_media;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m12_penyiapan_eksplan;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m13_teknik_penanaman;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m14_subkultur;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m15_aklimatisasi;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m2_perlakuan_khusus;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m5_setek_batang;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m1_pemilihan_benih;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m3_perkecambahan_benih_besar;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m4_perkecambahan_benih_kecil;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m6_setek_daun;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m7_setek_akar;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m8_cangkok;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.isipengenalankomponenmesin.m9_penyiapan_alat;

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
            return 15;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new m1_pemilihan_benih();
                case 1:
                    return new m2_perlakuan_khusus();
                case 8:
                    return new m9_penyiapan_alat();
                case 9:
                    return new m10_teknik_pembuatan_media_tanam();
                case 10:
                    return new m11_sterilisasi_media();
                case 11:
                    return new m12_penyiapan_eksplan();
                case 12:
                    return new m13_teknik_penanaman();
                case 13:
                    return new m14_subkultur();
                case 14:
                    return new m15_aklimatisasi();

            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Pemilihan Benih";
                case 1:
                    return "Perlakuan Khusus";
                case 8:
                    return "Penyiapan Alat";
                case 9:
                    return "Teknik Pembuatan Media Tanam";
                case 10:
                    return "Sterilisasi Media";
                case 11:
                    return "Penyiapan Eksplan";
                case 12:
                    return "Teknik Penanaman";
                case 13:
                    return "Subkultur";
                case 14:
                    return "Aklimatisasi";
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
