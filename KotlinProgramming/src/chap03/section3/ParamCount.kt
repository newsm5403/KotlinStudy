package chap03.section3

fun main() {
    noParam({ "Hello World!" })
    noParam { "Hello Wolrd!" }

    oneParam({ a -> "hello World! $a" })
    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World $it" }

    moreParam{a,b -> "Hello World! $a $b"}
    moreParam{_,b -> "Hello World! $b"}

    withArgs("Arg1", "Arg2", {a, b -> "Hello World! $a $b"})
    withArgs("Arg1", "Arg2") {a, b -> "Hello World! $a $b"}
}
fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("oneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}