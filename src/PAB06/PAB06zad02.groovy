package PAB06

def pmap = [Groovy: ['Asia', 'Jan'],
            Grails: ['Asia', 'Jan', 'Stefan', 'Mirek'],
            Java  : ['Asia', 'Stefan', 'Mirek'],
            JEE   : ['Slawek', 'Stefan', 'Janusz']
]

pmap.each { println("W projekcie: $it.key jest $it.value.size osób/osoby") }

println()

println(pmap.findAll { it.value.size() > 2 })

println()

def out = [:]
pmap.each { set ->
    set.value.each { valueElemnet ->
        if (out.get(valueElemnet) == null) {
            def tmpValuesList = []
            tmpValuesList << (set.key)
            out.put(valueElemnet, tmpValuesList)
        } else {
            out.get(valueElemnet) << set.key
        }
    }
}

println(out)

