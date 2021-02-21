package com.example.designpattern_mvp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.designpattern_mvp.Interface.Contract
import com.example.designpattern_mvp.Presenter.MainPresenter
import com.example.designpattern_mvp.R

//4
class MainActivity : AppCompatActivity(), Contract.View, View.OnClickListener {
    private lateinit var number1 : EditText
    private lateinit var number2 : EditText
    private lateinit var sumButton : Button

    private lateinit var presenter : Contract.Presenter //presenter와 통신하기 위해 객체 생성

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        sumButton = findViewById(R.id.sum)

        presenter = MainPresenter(this)

        sumButton.setOnClickListener(this)
    }

    override fun showResult(answer: Int) {
        //데이터 처리 후 Presenter에서 전달해준 데이터를 수신받아 UI 갱신
        findViewById<TextView>(R.id.result).text = answer.toString()
    }

    override fun onClick(v: View?) {
        //1. 사용자 이벤트 발생 -> Presenter로 이벤트 발생을 전달
        presenter.addNum(number1.text.toString().toInt(), number2.text.toString().toInt())

    }
}