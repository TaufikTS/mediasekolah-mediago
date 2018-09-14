package uzi.media.smk.lessons.lessons1.fragment.materi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pixplicity.fontview.FontAppCompatButton;

import uzi.media.smk.R;
import uzi.media.smk.lessons.lessons1.fragment.materi.elementpenyangga.ElementPenyanggaActivityL1;
import uzi.media.smk.lessons.lessons1.fragment.materi.elementransmisi.ElemenTransmisiActivityL1;
import uzi.media.smk.lessons.lessons1.fragment.materi.elementsambungan.ElementSambunganActivityL1;
import uzi.media.smk.lessons.lessons1.fragment.materi.penerapan.PenerapanActivityL1;
import uzi.media.smk.lessons.lessons1.fragment.materi.materi1.mater1Activity;
import uzi.media.smk.lessons.lessons1.fragment.materi.pengenalankomponenmesin.PengenalanKomponenMesinActivityL1;
import uzi.media.smk.lessons.lessons1.fragment.materi.materi2.materi2Activity;

/**
 * Created by uzi on 26/07/17.
 * Email : fauzisholichin@gmail.com
 */

public class MateriFragment extends Fragment implements View.OnClickListener {


    private FontAppCompatButton btn1;
    private FontAppCompatButton btn2;
    private FontAppCompatButton btn3;
    private FontAppCompatButton btn4;
    private FontAppCompatButton btn5;
    private FontAppCompatButton btn6;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_materi, container, false);
        btn1 = (FontAppCompatButton) v.findViewById(R.id.btn1);
        btn2 = (FontAppCompatButton) v.findViewById(R.id.btn2);
        btn3 = (FontAppCompatButton) v.findViewById(R.id.btn3);
        btn4 = (FontAppCompatButton) v.findViewById(R.id.btn4);
        btn5 = (FontAppCompatButton) v.findViewById(R.id.btn5);
        btn6 = (FontAppCompatButton) v.findViewById(R.id.btn6);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(new Intent(getActivity(), mater1Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(getActivity(), materi2Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(getActivity(), ElementSambunganActivityL1.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(getActivity(), ElemenTransmisiActivityL1.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(getActivity(), ElementPenyanggaActivityL1.class));
                break;
            case R.id.btn6:
                startActivity(new Intent(getActivity(), PengenalanKomponenMesinActivityL1.class));
                break;
            default:
                Toast.makeText(getActivity(), "Materi dalam Proses Pembuatan", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
