package uzi.media.smk.lessons.lessons1.fragment.materi.materi1.isipengantar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import uzi.media.smk.R;
import uzi.media.smk.util.FullScreenImage;

/**
 * Created by uzi on 27/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class PengertianElemenMesin extends Fragment {
    private ImageView ivGambar1;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pengertian_elemen_mesin_l1, container, false);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivGambar1 = (ImageView) view.findViewById(R.id.ivGambar1);
        ivGambar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullScreenImage.newInstance(R.drawable.pengantar1).show(getFragmentManager(), "image");
            }
        });
    }
}
