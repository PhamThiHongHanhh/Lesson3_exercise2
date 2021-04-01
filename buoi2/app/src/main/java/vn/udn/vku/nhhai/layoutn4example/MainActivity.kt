package vn.udn.vku.nhhai.layoutn4example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
 
class MainActivity : AppCompatActivity() {
    var currentValue = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast_activity)
        val countButton = findViewById<Button>(R.id.countBtn)
        val numberText = findViewById<TextView>(R.id.numberText)
        countButton.setOnClickListener {
            currentValue += 1
            numberText.text = currentValue.toString()
        }
    }
    fun toastBtnClick(view: View) {
        Toast.makeText(this,"This is counting app",Toast.LENGTH_LONG).show()
    }
    fun resetBtnHandler(view: View) {
        currentValue = 0
        val numberText = findViewById<TextView>(R.id.numberText)
        numberText.text = currentValue.toString()
    }
}