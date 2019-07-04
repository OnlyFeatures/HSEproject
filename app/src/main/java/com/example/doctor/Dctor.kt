package com.example.doctor

class Dctor(name: String, lastName: String, password: String){
    companion object{
        var number = 0
    }
    var id: String = "doctor"+(number++
}