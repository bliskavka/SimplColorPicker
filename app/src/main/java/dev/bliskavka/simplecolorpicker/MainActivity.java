package dev.bliskavka.simplecolorpicker;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.thebluealliance.spectrum.SpectrumPalette;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialog dialog = new Dialog(MainActivity.this);

        // Установите заголовок
        dialog.setTitle("Заголовок диалога");
        // Передайте ссылку на разметку
        dialog.setContentView(R.layout.dialog);
        // Найдите элемент TextView внутри вашей разметки
        // и установите ему соответствующий текст
        TextView text = (TextView) dialog.findViewById(R.id.textView);
        text.setText("Текст в диалоговом окне. Вы любите котов?");
        dialog.show();

        SimplColo
    }


}
