package edu.cpsc411a.persistence

import android.util.Log
import androidx.lifecycle.ViewModel

    private const val LOG_TAG = "RGB"
class MyViewModel:ViewModel() {

    private var redValue = 0
    private var greenValue = 0
    private var blueValue = 0
    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel Cleared")
    }

    fun getRed(): Int{
        return redValue
    }

    fun getGreen(): Int {
        return greenValue
    }
    fun getBlue(): Int{
        return blueValue
    }

    fun setRed(red: Int){
        redValue = red
    }

    fun setGreen(green: Int){
        greenValue = green
    }

    fun setBlue(blue: Int){
        blueValue = blue
    }
    fun setRGB(red: Int, green: Int, blue: Int) {
        redValue = red
        greenValue = green
        blueValue = blue

//        println("rgb = " + redValue + " " + greenValue + " " + blueValue)
//        Log.i(TAG, "setred value is" + red)
//        Log.i(TAG, "setgreen value is" + green)
//        Log.i(TAG, "setblue value is" + blue)
    }

}