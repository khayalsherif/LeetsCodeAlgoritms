package com.example.algoritms.easy

//---------------------------------------------------------------------------
fun main(){
    println(addBinary("11","1"))

}
fun addBinary(a: String, b: String): String {
    val int1 = Integer.parseInt(a,2)
    val int2 = Integer.parseInt(b,2)
    return Integer.toBinaryString(int1 + int2)
}