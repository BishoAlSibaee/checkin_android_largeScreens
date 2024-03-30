package com.example.mobilecheckdevice;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressDialog {

    Dialog D;

    ProgressDialog(Activity act,String dialogName,int max) {
        D = new Dialog(act);
        D.setContentView(R.layout.progress_dialog);
        D.setCancelable(false);
        TextView dName = D.findViewById(R.id.textView52);
        dName.setText(dialogName);
        ProgressBar P = D.findViewById(R.id.progressBar);
        P.setProgress(0);
        P.setMax(max);
    }

    void setProgress(int progress) {
        ProgressBar P = D.findViewById(R.id.progressBar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            P.setProgress(progress,true);
        }
        else {
            P.setProgress(progress);
        }
        if (progress == P.getMax()) {
            close();
        }
    }

    void close() {
        D.dismiss();
    }

    void show() {
        D.show();
    }
}
