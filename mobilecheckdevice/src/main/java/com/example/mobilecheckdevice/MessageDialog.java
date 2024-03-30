package com.example.mobilecheckdevice;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MessageDialog {
    private String title;
    private String message;
    private Context c;
    Dialog d;

    MessageDialog(String message, String title, Context c) {
        if (c != null) {
            this.message = message;
            this.title = title;
            this.c = c;
            d = new Dialog(c);
            d.setContentView(R.layout.message_dialog);
            TextView t = d.findViewById(R.id.messageDialog_title);
            t.setText(title);
            TextView m = d.findViewById(R.id.messageDialog_message);
            m.setText(message);
            Button b = d.findViewById(R.id.messageDialog_ok);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    d.dismiss();
                }
            });
            d.show();
        }
    }

    MessageDialog(String message, String title, Context c,boolean closeActivity) {
        if (c != null) {
            this.message = message;
            this.title = title;
            this.c = c;
            d = new Dialog(c);
            d.setContentView(R.layout.message_dialog);
            TextView t = d.findViewById(R.id.messageDialog_title);
            t.setText(title);
            TextView m = d.findViewById(R.id.messageDialog_message);
            m.setText(message);
            Button b = d.findViewById(R.id.messageDialog_ok);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    d.dismiss();
                    if (closeActivity) {
                        Activity a = (Activity) c;
                        a.finish();
                    }
                }
            });
            d.show();
        }
    }
}
