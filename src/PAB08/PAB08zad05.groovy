package PAB08

import java.text.Collator

def file = new File('resources\\04-words')
def comp = Collator.getInstance(new Locale('pl'))

def map = [:].withDefault { 0 }
file.text.split(/[\s\p{Punct}]+/).each { map[it]++ }

map.sort(comp).each { println it }


