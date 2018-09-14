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

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class OpeningActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        Button bntNext = (Button) findViewById(R.id.btnNext);
        bntNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpeningActivity.this, AfterOpeningActivity.class));
                finish();
            }
        });

        VideoView view = (VideoView) findViewById(R.id.vvOpening);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.opening_hortikultura;
        view.setVideoURI(Uri.parse(path));
        view.start();

        view.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent i = new Intent(getBaseContext(), AfterOpeningActivity.class);
                startActivity(i);
            }
        });
    }
}
