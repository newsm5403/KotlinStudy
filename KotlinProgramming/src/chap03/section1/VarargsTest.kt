package chap03.section1

fun main() {
    normalvarargs(1, 2, 3, 4)
    normalvarargs(4, 5, 6)
}

fun normalvarargs(vararg counts: Int){
    for (num in counts){
        print("$num ")
    }
    print("\n")
}