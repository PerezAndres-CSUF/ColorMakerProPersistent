package edu.cpsc411a.persistence


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.SeekBar
import com.google.android.material.switchmaterial.SwitchMaterial

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var colorBox: LinearLayout

    private lateinit var redSwitch: SwitchMaterial
    private lateinit var redSeekBar: SeekBar
    private lateinit var redEditText: EditText

    private lateinit var greenSwitch: SwitchMaterial
    private lateinit var greenSeekBar: SeekBar
    private lateinit var greenEditText: EditText

    private lateinit var blueSwitch: SwitchMaterial
    private lateinit var blueSeekBar: SeekBar
    private lateinit var blueEditText: EditText

    private  lateinit var resetButton: Button

    private fun updateColor() {

        //Log.i(TAG, "red value is" + redSeekBar.progress)
        val red = redSeekBar.progress*2.55f
        val green = greenSeekBar.progress*2.55f// Hardcoded green value (you can modify this)
        val blue = blueSeekBar.progress*2.55f// Hardcoded blue value (you can modify this)


        Log.i(TAG, "red value is" + red)
        Log.i(TAG, "green value is" + green)
        Log.i(TAG, "blue value is" + blue)
        // Create a color using RGB values
        val color = android.graphics.Color.rgb(red.toInt(), green.toInt(), blue.toInt())

        // Update the color of the colorBox ImageView
        colorBox.setBackgroundColor(color)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        colorBox = findViewById(R.id.Color_Maker)

        redSwitch = findViewById(R.id.Red_Switch)
        redSeekBar = findViewById(R.id.Red_SeekBar)
        redEditText = findViewById(R.id.Red_EditText)

        greenSwitch = findViewById(R.id.Green_Switch)
        greenSeekBar = findViewById(R.id.Green_SeekBar)
        greenEditText = findViewById(R.id.Green_EditText)

        blueSwitch = findViewById(R.id.Blue_Switch)
        blueSeekBar = findViewById(R.id.Blue_SeekBar)
        blueEditText = findViewById(R.id.Blue_EditText)

        resetButton = findViewById(R.id.Reset_Button)


        redSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Red switch is on, set the red component to a specific value (e.g., 255).
                redSeekBar.progress = 255
                redEditText.setText("255")
            } else {
                // Red switch is off, reset the red component to 0.
                redSeekBar.progress = 0
                redEditText.setText("0")
            }
            updateColor() // Call a function to update the color box.
        }

        redSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                redEditText.setText(progress.toString())
                updateColor() // Call a function to update the color box.
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        redEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Parse the text and update the red component accordingly.
                val inputText = s.toString()
                val redValue = inputText.toIntOrNull() ?: 0
                redSeekBar.progress = redValue
                //redEditText.text = Editable.Factory.getInstance().newEditable(redEditText.getText())
                //redEditText.setText(redEditText.getText())
                updateColor() // Call a function to update the color box.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                redEditText.setSelection(redEditText.length())
            }
        })

        greenSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Red switch is on, set the red component to a specific value (e.g., 255).
                greenSeekBar.progress = 255
                greenEditText.setText("255")
            } else {
                // Red switch is off, reset the red component to 0.
                greenSeekBar.progress = 0
                greenEditText.setText("0")
            }
            updateColor() // Call a function to update the color box.
        }

        greenSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                greenEditText.setText(progress.toString())
                updateColor() // Call a function to update the color box.
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        greenEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Parse the text and update the red component accordingly.
                val inputText = s.toString()
                val greenValue = inputText.toIntOrNull() ?: 0
                greenSeekBar.progress = greenValue
                //redEditText.text = Editable.Factory.getInstance().newEditable(redEditText.getText())
                //redEditText.setText(redEditText.getText())
                updateColor() // Call a function to update the color box.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                greenEditText.setSelection(greenEditText.length())
            }
        })

        blueSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Red switch is on, set the red component to a specific value (e.g., 255).
                blueSeekBar.progress = 255
                blueEditText.setText("255")
            } else {
                // Red switch is off, reset the red component to 0.
                blueSeekBar.progress = 0
                blueEditText.setText("0")
            }
            updateColor() // Call a function to update the color box.
        }

        blueSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                blueEditText.setText(progress.toString())
                updateColor() // Call a function to update the color box.
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        blueEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Parse the text and update the red component accordingly.
                val inputText = s.toString()
                val blueValue = inputText.toIntOrNull() ?: 0
                blueSeekBar.progress = blueValue
                //redEditText.text = Editable.Factory.getInstance().newEditable(redEditText.getText())
                //redEditText.setText(redEditText.getText())
                updateColor() // Call a function to update the color box.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                blueEditText.setSelection(blueEditText.length())
            }
        })

        resetButton.setOnClickListener {

            redSeekBar.progress = 0
            redEditText.setText("0")
            greenSeekBar.progress = 0
            greenEditText.setText("0")
            blueSeekBar.progress = 0
            blueEditText.setText("0")

            // Default values for red, green and blue is 100
            val color = android.graphics.Color.rgb(100, 100, 100)

            // Update the color of the colorBox (Color_Maker)
            colorBox.setBackgroundColor(color)
        }

    }
}