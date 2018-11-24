package com.example.kotlin.kotlin_atv4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_radio.*
import kotlinx.android.synthetic.main.activity_radio.view.*

class RadioActivity : AppCompatActivity() {

    var result: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)

        rdgroup.rdbtnBcc.isChecked = true


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("result", result!!)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        result = savedInstanceState.getInt("result")
    }

    fun gotoMainActivity(view: View) {
        val intent = Intent(applicationContext, MainActivity::class.java)
           // val radio: RadioButton = view.findViewById(rdgroup.checkedRadioButtonId)
            var id: Int = rdgroup.checkedRadioButtonId
            //val radio: RadioButton = findViewById(id)
            intent.putExtra("result", id)
            startActivity(intent)
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)

    }

}
