package com.example.kotlin.kotlin_atv4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import kotlinx.android.synthetic.main.activity_radio.*

class MainActivity : AppCompatActivity() {

    var result: Int? = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val i = Intent(this, RadioActivity::class.java)

        //refreshText(i.getIntExtra("result",0 ))

//        if ((i.getIntExtra("result") != null)
//                && (savedInstanceState.getInt("result") != null)){
//            refreshText(savedInstanceState.get("result") as Int)
//        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == result && resultCode == 1){
            btnSelect.text = getString(R.string.rdbtnBcc)
        }
        if(requestCode == result && resultCode == 2){
            btnSelect.text = getString(R.string.rdbtnBsi)
        }
        if(requestCode == result && resultCode == 3){
            btnSelect.text = getString(R.string.rdbtnLc)
        }
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        result = savedInstanceState.getInt("result")
    }


    fun gotoRadioActivity(view : View){
        val intent = Intent(applicationContext,RadioActivity::class.java)
        // intent.putExtra("input",editText.text.toString())
        startActivity(intent)
    }


}

