package PAB02

def maximum(list){
    output = []
    indexes = []
    objectsMap = [:]
    list.eachWithIndex { it, index ->
        if(!objectsMap.containsKey(it)){
            indexes.add(index)
            objectsMap.put(it,indexes)
            indexes = []
        }else{
            List listTmp = objectsMap.get(it)
            listTmp.add(index)
            objectsMap.put(it,listTmp)
        }
    }
    objectsMap = objectsMap.sort {it.value}
    output.add(objectsMap.entrySet().last().key)
    output.add(objectsMap.entrySet().last().value)
    return output
}

(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"