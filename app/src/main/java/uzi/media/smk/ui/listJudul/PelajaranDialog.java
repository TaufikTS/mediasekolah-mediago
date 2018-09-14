package uzi.media.smk.ui.listJudul;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;

import uzi.media.smk.R;
import uzi.media.smk.ui.base.BaseDialogFragment;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class PelajaranDialog extends BaseDialogFragment {

    public static PelajaranDialog newInstance() {
        Bundle args = new Bundle();
        PelajaranDialog fragment = new PelajaranDialog();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected Dialog setupDialog(AlertDialog.Builder builder) {
        AlertDialog dialog = builder.create();
        return dialog;
    }

    @Override
    protected int setView() {
        return R.layout.fragment_pelajaran_dialog;
    }
}
