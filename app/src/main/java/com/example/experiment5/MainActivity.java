package com.example.experiment5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

         CheckBox c1,c2,c3;
         Button btn;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            c1 = findViewById(R.id.c1);
            c2 = findViewById(R.id.c1);
            c3 = findViewById(R.id.c1);
            btn = findViewById(R.id.btn);
            btn.setOnClickListener(v -> {
                String selectedCheckboxes = "";


                if (c1.isChecked()) {
                    selectedCheckboxes += "Python ";
                }


                if (c2.isChecked()) {
                    selectedCheckboxes += "Java ";
                }


                if (c3.isChecked()) {
                    selectedCheckboxes += "PHP ";
                }


                if (selectedCheckboxes.isEmpty()) {
                    Toast.makeText(MainActivity.this, "No checkboxes selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Selected checkboxes: " + selectedCheckboxes, Toast.LENGTH_SHORT).show();
                }
            });
}


}