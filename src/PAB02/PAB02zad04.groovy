package PAB02

import groovy.transform.Field

@Field
List transformed = []

List getData(Class type = String, Closure c = { it }) {
    String data = "42.58 1 3 4 555.55 0 ala ma kota"
    List l = data.tokenize(" ")

    l.eachWithIndex { it, index ->
        try {
            if (c.call(it.asType(type)))
                transformed.add(it)
        } catch (NumberFormatException e) {
            println(it + " not instanceof " + type)
        }
    }
    transformed
}

//spr
//println getData(Integer) { it > 0 }            // liczby całkowite większe od 0
//println getData(String) { it.size() > 3 }   // słowa o długości większej od 3 (domyślny typ: String)
//println getData()                          // dowolne napisy (słowa)
println getData(BigDecimal)         // dowolne liczby
