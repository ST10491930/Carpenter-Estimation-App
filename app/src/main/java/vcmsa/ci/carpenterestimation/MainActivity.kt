package vcmsa.ci.carpenterestimation

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var tvDisplay2: TextView
    private lateinit var etInput: EditText
    private lateinit var cbNum1: CheckBox
    private lateinit var cbNum2: CheckBox
    private lateinit var cbNum3: CheckBox
    private lateinit var cbNum4: CheckBox
    private lateinit var btnCalc: Button
    private lateinit var rbGroup: RadioGroup
    private lateinit var rbNum1: RadioButton
    private lateinit var rbNum2: RadioButton
    private lateinit var rbNum3: RadioButton
    private lateinit var rbNum4: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvDisplay2 = findViewById(R.id.tvDisplay2)
        etInput = findViewById(R.id.etInput)
        cbNum1 = findViewById(R.id.cbNum1)
        cbNum2 = findViewById(R.id.cbNum2)
        cbNum3 = findViewById(R.id.cbNum3)
        cbNum4 = findViewById(R.id.cbNum4)
        btnCalc = findViewById(R.id.btnCalc)
        rbGroup = findViewById(R.id.rbGroup)
        rbNum1 = findViewById(R.id.rbNum1)
        rbNum2 = findViewById(R.id.rbNum2)
        rbNum3 = findViewById(R.id.rbNum3)
        rbNum4 = findViewById(R.id.rbNum4)


    }
}