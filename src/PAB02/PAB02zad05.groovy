package PAB02

def eachTuple(def input, Closure c) {
    int paramsCount = c.getMaximumNumberOfParameters()
    List collatedList
    if (input instanceof String)
        collatedList = input.split("").collate(paramsCount)
    else
        collatedList = input.collate(paramsCount)

    collatedList.each { c.call(it) }
}

//spr
def list = (1..40)

eachTuple(list) { e1, e2, e3, e4 ->
    println "$e1 $e2 $e3 $e4"
}

def s = 'asia ma kota i psa'

def out = new StringBuffer()
eachTuple(s) { a, b ->
    out << b << a
}
println out
