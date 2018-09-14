package uzi.media.smk.ui.listJudul;

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

public class ListPelajaranAdapter extends RecyclerView.Adapter<ListPelajaranViewHolder> {

    private ListPelajaranActivity activity;
    private ListInterface listener;
    private List<Pelajaran> pelajaran;

    public ListPelajaranAdapter(ListPelajaranActivity activity, ListInterface listener) {
        this.activity = activity;
        this.listener = listener;
    }

    public void setPelajaran(List<Pelajaran> pelajaran) {
        this.pelajaran = pelajaran;
    }

    @Override
    public ListPelajaranViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelajaran, parent, false);
        return new ListPelajaranViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListPelajaranViewHolder holder, int position) {
        holder.bind(listener,pelajaran.get(position));
    }

    @Override
    public int getItemCount() {
        return pelajaran.size();
    }
}
