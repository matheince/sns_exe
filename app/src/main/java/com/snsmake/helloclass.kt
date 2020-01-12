package com.snsmake

fun main(){

    // class 란 유사 기능들(함수)의 집합체(객체)
    // 1. class 위의 설명
    // 2. data class - setter, getter 기본
    var cls = Helloclass()
    var cls2 = Helloclass(1) // 인수가 전달된 후 호출 됨
    var person = Person(5,"mathience")

    
    println(person.age)
    println(person.name)


}
class Helloclass {
    var age : Int = 0
    init {

    }
    // default 생성자, class 호출시 자동으로 맨 먼저 호출 됨
    constructor()

    // 보조 생성자
    constructor(age: Int){
        this.age = age
    }

}
data class Person(var age:Int, val name: String)