package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;


import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;


public class OneTimeDialog {

    Context context;
   protected OneTimeDialog(Context mcontext){
        this.context=mcontext;
    }

    protected void oneTime(String never, String title, String content, final String getbool) {
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);//this==context
        if (!prefs.contains(getbool)) {
            final AlertDialog.Builder builder;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                builder = new AlertDialog.Builder(context, R.style.Theme_AppCompat_Dialog_MinWidth);
            } else {
                builder = new AlertDialog.Builder(context);
            }
            builder.setTitle(title)
                    .setMessage(content)
                    .setPositiveButton(never, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            SharedPreferences.Editor editor = prefs.edit();
                            editor.putBoolean(getbool, true);
                            editor.apply();
                        }
                    })
                    .setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    })
                    .setIcon(R.drawable.alerts)
                    .show();
        }
    }


}
