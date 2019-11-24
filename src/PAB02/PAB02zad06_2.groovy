package PAB02

long start
long count = 0
def startTimer = { start = System.currentTimeMillis() }
def elapsed = { System.currentTimeMillis() - start }

fib = { n ->
    count++
    if (n < 2) n
    else fib(n - 1) + fib(n - 2)
}

startTimer()
println fib(34)
println 'Czas = ' + elapsed()/1000 + ' sek. Wolań: ' + count

println()

//Or: @Memoized
fib = fib.memoize()

count = 0
startTimer()
println fib(34)
println 'Czas = ' + elapsed()/1000 + ' sek. Wolań: ' + count
