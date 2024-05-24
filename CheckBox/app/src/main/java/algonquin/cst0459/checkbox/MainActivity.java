package algonquin.cst0459.checkbox;




import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAndroid, chkJava, chkAngular, chkPython;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkAndroid = findViewById(R.id.chkAndroid);
        chkAngular = findViewById(R.id.chkAngular);
        chkJava = findViewById(R.id.chkJava);
        chkPython = findViewById(R.id.chkPython);

        Button btn = findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("Selected Courses:");
                if (chkAndroid.isChecked()) {
                    result.append("\nAndroid");
                }
                if (chkAngular.isChecked()) {
                    result.append("\nAngularJS");
                }
                if (chkJava.isChecked()) {
                    result.append("\nJava");
                }
                if (chkPython.isChecked()) {
                    result.append("\nPython");
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chkAndroid:
                str = checked ? "Android Selected" : "Android Deselected";
                break;
            case R.id.chkAngular:
                str = checked ? "AngularJS Selected" : "AngularJS Deselected";
                break;
            case R.id.chkJava:
                str = checked ? "Java Selected" : "Java Deselected";
                break;
            case R.id.chkPython:
                str = checked ? "Python Selected" : "Python Deselected";
                break;
        }

        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
