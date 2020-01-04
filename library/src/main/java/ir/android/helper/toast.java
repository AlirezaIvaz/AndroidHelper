package ir.android.helper;

import android.content.Context;
import android.widget.Toast;

public class toast {
    public static void ToastMaker (Context c, String m){
        Toast.makeText(c, m, Toast.LENGTH_SHORT).show();
    }
}
