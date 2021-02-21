package com.example.designpattern_mvp.Model

import android.util.Log
import com.example.designpattern_mvp.Interface.Contract

//2.
class Model(presenter: Contract.Presenter?) {
    var presenter = presenter

    fun saveData(data: Unit) {
        //처리 로직
        var data = data
    }
}