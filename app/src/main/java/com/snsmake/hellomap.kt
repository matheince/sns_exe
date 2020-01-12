package com.snsmake

fun main(){
    //map - key, value Pair JSon {"~~~" : "~~~"}
    var map1 = mapOf(Pair("name", "mathience"))  // 수정 불가능
    var map2= mutableMapOf<String, String>()     // 수정 가능

    map2.put("name", "mathience")
    map2.put("age", "1")
    println("key 만을 출력")
    println(map2.keys)

    println("key, value 출력")
    for(item in map2){
        //println(item)  // println(map2) 차이점은 이건 두번찍힌다는 점.
        //println(item.value)  // map의 값만 찍힘
        println(item)
    }
}

// kotlin org 공식 사이트 참조.
