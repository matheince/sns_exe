package com.snsmake

fun main(){
    var arr1 = listOf("1","2") // ArrayList <== 넣고 빼고 수정가능해야 하는데  listof는 불가능
    var arr2 = mutableListOf("대","한") // 수정 가능 Array

    for(caseitem in arr1){  // arr1배열안의 caseitem 하나씩  단, caseitem은 아무이름이나 좋다.
        println(caseitem)
    }
    for((index, item) in arr1.withIndex()){
        println("$index 번째 값 $item")
    }
    var hello : Any = "hello World"
    if(hello is String){
        var str : String = hello

    }
}