package edu.stts.materialcomponents.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu2.BasicButtonActivity
import kotlinx.android.synthetic.main.activity_menu_2.*

class Menu2Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_2)
        init()
    }

    private fun init() {

        button1.setOnClickListener(View.OnClickListener {

            val i = Intent(this, BasicButtonActivity::class.java)
            startActivity(i)

        })

    }

}