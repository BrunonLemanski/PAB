package PAB02

import groovy.transform.Field
import groovy.transform.TailRecursive

@Field
List transformed = []

@TailRecursive
List apply(List l, Closure c) {
    if (l.size() == 0) {
        println transformed
    } else {
        transformed.add((c.call(l.get(0))))
        apply(l.tail(), c)
    }
}

//spr
apply([1, 2, 3, 4, 5, 6]) { it + 2 }

transformed = []
List l2 = ['a', 'b', 'c', 'd', 'e', 'f']
apply(l2) { it + 2 }

transformed = []
List l3 = ["Ala", "ma", "kota"]
def c3 = { it.size() > 3 }
apply(l3, c3)