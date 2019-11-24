package PAB02

import groovy.transform.TailRecursive

//trampoline i meomized - podrecznikowe przyklady z annotation
long start
def startTimer = { start = System.currentTimeMillis() }
def elapsed = { System.currentTimeMillis() - start }

//TCO
@TailRecursive
def factorial(n,res) {
    res *= n
    if (n == 1) {
        "Result: $res"
    } else {
        factorial(n - 1,res)
    }
}

startTimer()
def res = 1
println factorial(12,res)
println 'Czas = ' + elapsed()/1000

println()

//Normal factorial
def factorial2(n,res2) {
    res2 *= n
    if (n == 1) {
        "Result: $res2"
    } else {
        factorial(n - 1,res2)
    }
}

startTimer()
def res2 = 1
println factorial2(12,res2)
println 'Czas = ' + elapsed()/1000