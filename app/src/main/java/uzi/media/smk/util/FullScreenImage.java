package uzi.media.smk.util;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

import uzi.media.smk.R;
import uzi.media.smk.base.BaseDialogFragment;

/**
 * Created by fauzi sholichin on 23/12/17.
 * Email : fauzisholichin@gmail.com
 */

public class FullScreenImage extends BaseDialogFragment {
    private static int gambar1;
    private ImageView ivFull;


    public static FullScreenImage newInstance(int image) {
        gambar1 = image;
        Bundle args = new Bundle();
        FullScreenImage fragment = new FullScreenImage();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initView(View view) {
        ivFull = (ImageView) view.findViewById(R.id.ivFull);
        ivFull.setImageResource(gambar1);
        ivFull.setOnTouchListener(new ImageMatrixTouchHandler(getActivity().getBaseContext()));
    }


    @Override
    protected Dialog setupDialog(AlertDialog.Builder builder) {

        AlertDialog dialog = builder.create();
        return dialog;
    }

    @Override
    protected int setView() {
        return R.layout.image_fullscreen;
    }
}
