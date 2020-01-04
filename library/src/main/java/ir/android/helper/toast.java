package ir.android.helper;

import android.content.Context;
import android.widget.Toast;

public class toast {
    public static void ShortToast (Context c, String m){
        Toast.makeText(c, m, Toast.LENGTH_SHORT).show();
    }
    public static void LongToast (Context c, String m) {
        Toast.makeText(c, m, Toast.LENGTH_LONG).show();
    }
}
