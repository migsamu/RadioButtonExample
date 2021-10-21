package org.iesfm.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cargarResolucion480(View view) {
        RadioButton rb480p = (RadioButton) findViewById(R.id.rb480p);

        if (rb480p.isChecked()){
            Toast.makeText(this, "Ha seleccionado 480p", Toast.LENGTH_SHORT).show();

        }

    }

    public void cargarResolucion(View view) {
        RadioGroup rgResolution = (RadioGroup) findViewById(R.id.rgResolucion);
        switch (rgResolution.getCheckedRadioButtonId()) {
            case R.id.rb480p:
                Toast.makeText(this, "Ha seleccionado 480p", Toast.LENGTH_SHORT).show();
        }
    }
}