package com.snsmake

fun main(){
    val hello1: String = " hello World" // final <-- java
    var hello2 : String = " hello World" // String hello2
    // hello1 = "123"  // val은 수정 불가능
    hello2 = "123"  //var 는 수정 가능
    print(hello1)
    print(hello2)
    print(hello())


}

fun hello() : String {  // : String 의 의미는 리턴 밸류가 String 이라는 뜻
    var hello3 : String = "안녕하세요"
    return "안녕하세요"
}