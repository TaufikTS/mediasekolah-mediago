package uzi.media.smk.ui.listmateri;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import uzi.media.smk.R;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class ListMateriAdapter extends RecyclerView.Adapter<ListMateriViewHolder> {
    private ListMateriListener listener;
    private List<Materi> materi;


    public ListMateriAdapter(ListMateriListener listener) {
        this.listener = listener;
    }

    public void setPelajaran(List<Materi> materi) {
        this.materi = materi;
    }


    @Override
    public ListMateriViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_materi, parent, false);
        return new ListMateriViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListMateriViewHolder holder, int position) {
        holder.bind(listener, materi.get(position));
    }

    @Override
    public int getItemCount() {
        return materi.size();
    }
}
