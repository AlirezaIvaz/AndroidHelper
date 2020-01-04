package ir.android.helper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class dialog {
    public static void Dialog (Context context, String title, String message) {
        AlertDialog.Builder alert = new AlertDialog.Builder(context);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.setPositiveButton("باشه", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();
    }
    public static void CompatDialog (Context context, String title, String message) {
        androidx.appcompat.app.AlertDialog.Builder alert = new androidx.appcompat.app.AlertDialog.Builder(context);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.setPositiveButton("باشه", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();
    }
}
