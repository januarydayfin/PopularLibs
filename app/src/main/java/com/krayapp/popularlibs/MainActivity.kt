package com.krayapp.popularlibs

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View {

    private val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_counter1.setOnClickListener {
            presenter.firstCounter()
        }
        btn_counter2.setOnClickListener {
            presenter.secondCounter()
        }
        btn_counter3.setOnClickListener {
            presenter.thirdCounter()
        }
        initCounters()
    }


    override fun setCounter(index: Int, count: Int) {
        when (index) {
            0 -> {
                btn_counter1.text = "$count"
            }
            1 -> {
                btn_counter2.text = "$count"
            }
            2 -> {
                btn_counter3.text = "$count"
            }
        }
    }

    override fun initCounters() {
        btn_counter1.text = "0"
        btn_counter2.text = "0"
        btn_counter3.text = "0"
    }
}