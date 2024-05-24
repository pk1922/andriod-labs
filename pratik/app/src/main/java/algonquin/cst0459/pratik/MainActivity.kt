import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var sw1: Switch
    private lateinit var sw2: Switch
    private lateinit var btnGet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize switches and button
        sw1 = findViewById(R.id.switch1)
        sw2 = findViewById(R.id.switch2)
        btnGet = findViewById(R.id.getBtn)

        btnGet.setOnClickListener {
            val str1 = if (sw1.isChecked) sw1.textOn.toString() else sw1.textOff.toString()
            val str2 = if (sw2.isChecked) sw2.textOn.toString() else sw2.textOff.toString()

            Toast.makeText(
                applicationContext,
                "Switch1 -  $str1 \nSwitch2 - $str2",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

}
}