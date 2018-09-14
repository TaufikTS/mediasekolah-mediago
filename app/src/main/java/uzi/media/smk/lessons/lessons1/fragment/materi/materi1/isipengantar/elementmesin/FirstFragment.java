package uzi.media.smk.lessons.lessons1.fragment.materi.materi1.isipengantar.elementmesin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import uzi.media.smk.R;
import uzi.media.smk.util.FullScreenImage;

/**
 * Created by fauzi sholichin on 02/12/17.
 * Email : fauzisholichin@gmail.com
 */

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first_elemen_mesin, container, false);

        TextView tv = (TextView) v.findViewById(R.id.tvTitle);
        tv.setText(getArguments().getString("msg"));
        ImageView ivImage = (ImageView) v.findViewById(R.id.ivImage);
        ivImage.setBackgroundResource(getArguments().getInt("img"));
        ivImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullScreenImage.newInstance(getArguments().getInt("img")).show(getFragmentManager(), "image");
            }
        });
        TextView tvtop = (TextView) v.findViewById(R.id.tvtoptitle);
        tvtop.setText(getArguments().getString("msgtop"));
        return v;
    }

    public static FirstFragment newInstance(String toptitle, String text, int voip) {

        FirstFragment f = new FirstFragment();
        Bundle b = new Bundle();
        b.putString("msgtop", toptitle);
        b.putString("msg", text);
        b.putInt("img", voip);
        f.setArguments(b);

        return f;
    }
}
