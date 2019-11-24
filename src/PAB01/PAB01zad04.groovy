package PAB01

println "Podaj liczbe do konwersji: "
def input = System.in.newReader().readLine()
map1 = [1: 'jeden ', 2: 'dwa ', 3: 'trzy ', 4: 'cztery ',
        5: 'piec ', 6: 'szesc ', 7: 'siedem ', 8: 'osiem ', 9: 'dziewiec ']

def output = ''
for (item in input)
    output+=map1[item.toInteger()]

println(output.tokenize().join('-'))
