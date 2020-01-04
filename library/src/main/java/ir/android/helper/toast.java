package ir.android.helper;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.Toast;

public class toast {
    public static void ShortToast (Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
    public static void LongToast (Context c, String text) {
        Toast.makeText(c, text, Toast.LENGTH_LONG).show();
    }
    public static void CustomToast (Context context, String text, Typeface typeface){
        SpannableString efr = new SpannableString(text);
        efr.setSpan(new FontProvider(typeface), 0, efr.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        Toast.makeText(context, efr, Toast.LENGTH_SHORT).show();
    }
}
