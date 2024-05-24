package algonquin.cst0459.aswitch;



import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Switch sw1, sw2;
    private Button btnGet;
    private ImageButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize switches and button
        sw1 = findViewById(R.id.switch1);
        sw2 = findViewById(R.id.switch2);
        btnGet = findViewById(R.id.getBtn);
        addBtn = findViewById(R.id.addBtn);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1, str2;
                if (sw1.isChecked()) {
                    str1 = sw1.getTextOn().toString();
                } else {
                    str1 = sw1.getTextOff().toString();
                }

                if (sw2.isChecked()) {
                    str2 = sw2.getTextOn().toString();
                } else {
                    str2 = sw2.getTextOff().toString();
                }

                Toast.makeText(getApplicationContext(), "Switch1 - " + str1 + "\nSwitch2 - " + str2, Toast.LENGTH_SHORT).show();
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ImageButton Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
