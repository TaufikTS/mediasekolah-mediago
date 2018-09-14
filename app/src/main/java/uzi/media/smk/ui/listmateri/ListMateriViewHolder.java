package uzi.media.smk.ui.listmateri;

import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import uzi.media.smk.R;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class ListMateriViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivMateri;
    private CardView cvMateri;
    private TextView tvMateri;

    public ListMateriViewHolder(View itemView) {
        super(itemView);
        ivMateri = (ImageView) itemView.findViewById(R.id.ivMateri);
        cvMateri = (CardView) itemView.findViewById(R.id.cvMateri);
        tvMateri = (TextView) itemView.findViewById(R.id.tvMateri);
    }

    public void bind(final ListMateriListener listener, final Materi materi) {
        tvMateri.setText(materi.getName());
        cvMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(materi);
            }
        });
        ivMateri.setBackgroundResource(materi.getId_gambar());
    }
}
