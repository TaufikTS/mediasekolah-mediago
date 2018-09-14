package uzi.media.smk.ui.listJudul;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import uzi.media.smk.R;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class ListPelajaranViewHolder extends RecyclerView.ViewHolder {
    private RelativeLayout backgroud;
    private TextView text;

    public ListPelajaranViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.tvPelajaran);
        backgroud = (RelativeLayout) itemView.findViewById(R.id.rvPelajaran);
    }

    public void bind(final ListInterface listener, final Pelajaran pelajaran) {
        text.setText(pelajaran.getNama());
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(pelajaran);
            }
        });
        if (pelajaran.getColor() == 1) {
            backgroud.setBackgroundColor(Color.parseColor("#FC9914"));
        } else if (pelajaran.getColor() == 2) {
            backgroud.setBackgroundColor(Color.parseColor("#99D805"));
        } else if (pelajaran.getColor() == 3) {
            backgroud.setBackgroundColor(Color.parseColor("#F2EC02"));
        } else if (pelajaran.getColor() == 4) {
            backgroud.setBackgroundColor(Color.parseColor("#BBBBFF"));
        } else if (pelajaran.getColor() == 5) {
            backgroud.setBackgroundColor(Color.parseColor("#C9A887"));
        } else if (pelajaran.getColor() == 6) {
            backgroud.setBackgroundColor(Color.parseColor("#DC8961"));
        }

        }
}
