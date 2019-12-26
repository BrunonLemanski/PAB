package PAB08

def input = ['-34','-3','342','0','11','-34','23','66','-0','-3','-66']
def out = input*.toInteger().sort().findAll() {it < 0}
println out