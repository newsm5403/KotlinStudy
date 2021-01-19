package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc()
    }
}

class otherClass {
    private val opc = PrivateClass()
    fun test(){
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
    pc.access()
}

fun TopFunction(){
    val tpc = PrivateClass()
}

