package PAB08

def input = ['-34', '-3', '342', '0', '11', '-34', '23', '66', '-0', '-3', '-66']
def comp = { o1, o2 -> o2 - o1 } as Comparator
def out = input*.toInteger().sort(false, comp)
def out2 = input*.toInteger().sort(false, Comparator.reverseOrder())
println input
println out

assert out == out2