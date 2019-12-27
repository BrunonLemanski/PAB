package PAB08

import java.text.Collator
import static javax.swing.JOptionPane.*

def compLocale = Collator.getInstance(new Locale('en'))
def words = new URL('http://wiki.puzzlers.org/pub/wordlists/unixdict.txt').readLines()

def groups = words.groupBy { it.toList().sort(false,compLocale) }

def mapRes = [:].withDefault { [] }
groups.each { k, v -> mapRes[k].add(v) }

mapRes = mapRes.findAll { it.value.first().size() > 1 }

println mapRes.sort { o1, o2 -> o1.value.first().size() <=> o2.value.first().size() }
        .collect{ it.value }.collect{ it.join(' ') }.join('\n')

while (word = showInputDialog 'Enter word for anagrams' ) {
    def anagramsList = mapRes[word.toList().sort()].first()
    showMessageDialog null, "Word: $word\nAnagrams: " + anagramsList
}
