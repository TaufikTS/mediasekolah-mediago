package uzi.media.smk.ui.opening;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import uzi.media.smk.R;
import uzi.media.smk.ui.listJudul.ListPelajaranActivity;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class AfterOpeningActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_opening);
        Button bntNext = (Button) findViewById(R.id.btnNext);
        bntNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AfterOpeningActivity.this, ListPelajaranActivity.class));
                finish();
            }
        });

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AfterOpeningActivity.this, OpeningActivity.class));
            }
        });

        VideoView view = (VideoView) findViewById(R.id.vvOpening);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.afteropening;
        view.setVideoURI(Uri.parse(path));
        view.start();
        view.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent i = new Intent(getBaseContext(), ListPelajaranActivity.class);
                startActivity(i);
            }
        });
    }
}
