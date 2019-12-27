package PAB08

def file = new File('resources\\04-words')
def comp = { o1, o2 -> o1.size() - o2.size() } as Comparator
def set = file.readLines() as TreeSet
def out = set.sort(false,comp)

println out