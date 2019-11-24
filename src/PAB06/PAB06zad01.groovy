package PAB06

def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]

list1.each {print(" $it")}
list2.each {print(" $it")}

println()

def list3 = []
list1.each {list3.add(it+it)}

println()

def list4 = []
list2.each {list4.add(it*it)}

list3.each {print(" $it")}
list4.each {print(" $it")}