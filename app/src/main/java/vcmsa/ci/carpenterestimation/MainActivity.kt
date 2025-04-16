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
    private lateinit var btnAddOptions: Button
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
        btnAddOptions = findViewById(R.id.btnAddOptions)
        rbGroup = findViewById(R.id.rbGroup)
        rbNum1 = findViewById(R.id.rbNum1)
        rbNum2 = findViewById(R.id.rbNum2)
        rbNum3 = findViewById(R.id.rbNum3)
        rbNum4 = findViewById(R.id.rbNum4)

        btnAddOptions.setOnClickListener {
            // Create and add CheckBoxes
            val checkBox1 = CheckBox(this)
            checkBox1.text = "Check Option 1"
            val dynamicLayout = null
            dynamicLayout.addView(checkBox1)

            val checkBox2 = CheckBox(this)
            checkBox2.text = "Check Option 2"
            dynamicLayout.addView(checkBox2)

            val checkBox3 = CheckBox(this)
            checkBox3.text = "Check Option 3"
            dynamicLayout.addView(checkBox3)

            val checkBox4 = CheckBox(this)
            checkBox4.text = "Check Option 4"
            dynamicLayout.addView(checkBox4)

            // Create and add RadioGroup with RadioButtons
            val radioGroup = RadioGroup(this)
            radioGroup.orientation = RadioGroup.VERTICAL

            val radioButton1 = RadioButton(this)
            radioButton1.text = "Radio Option 1"
            radioGroup.addView(radioButton1)

            val radioButton2 = RadioButton(this)
            radioButton2.text = "Radio Option 2"
            radioGroup.addView(radioButton2)

            val radioButton3 = RadioButton(this)
            radioButton3.text = "Radio Option 3"
            radioGroup.addView(radioButton3)

            val radioButton4 = RadioButton(this)
            radioButton4.text = "Radio Option 4"
            radioGroup.addView(radioButton4)

            dynamicLayout.addView(radioGroup)


        }


    }
}

private fun Nothing?.addView(radioGroup: RadioGroup) {
    TODO("Not yet implemented")
}

private fun Nothing?.addView(checkBox1: CheckBox) {
    TODO("Not yet implemented")
}
