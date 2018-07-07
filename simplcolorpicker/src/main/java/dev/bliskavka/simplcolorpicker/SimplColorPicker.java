package dev.bliskavka.simplcolorpicker;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

/**
 * Created by Odmin on 07.07.2018.
 */

public class SimplColorPicker {
    Context context;
    Dialog dialog = new Dialog(context);

    public SimplColorPicker(Context context) {
        this.context = context;
        dialog.setTitle("Заголовок диалога");
        dialog.setContentView(R.layout.colorpicker_dialog);
        dialog.show();
    }

}
