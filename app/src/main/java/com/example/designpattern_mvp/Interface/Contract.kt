package com.example.designpattern_mvp.Interface

//1. View와 Presenter를 연결하기 위한 Interface
interface Contract {

   interface View {
        fun showResult(answer: Int) //값을 보여줄 View 메소드 선언
    }

    interface Presenter {
        fun addNum(num1: Int, num2: Int) //결과 값 구하기 위한 메소드 선언
    }

}