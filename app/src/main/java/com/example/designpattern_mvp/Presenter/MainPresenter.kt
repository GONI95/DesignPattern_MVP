package com.example.designpattern_mvp.Presenter

import com.example.designpattern_mvp.Interface.Contract
import com.example.designpattern_mvp.Model.Model

//3.
class MainPresenter(view : Contract.View) : Contract.Presenter {
    val view = view     // Activty View정보 가져와 통신
    val model = Model(this)     // Model 객체 생성

    //Presenter를 상속하고 addNum 구현
    override fun addNum(num1: Int, num2: Int) {
        var result = view!!.showResult(num1 + num2)  //View 업데이트

        model.saveData(result)
    }
}