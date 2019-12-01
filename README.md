# PAB_Groovy
 Technology in programming bussines applications.
 
# Description
Continuations of UTP. Own repositry of academy tasks with groovy script which extends java functionality.

# List of tasks

### PAB 01
4.Napisać pogram przekształcający liczby na ich słowne odpowiedniki.
       Np. po wprowadzeniu liczby 147 winniśmy uzyskać jeden - cztery - siedem.

5.Napisy wprowadzane w kolejnych dialogach mają formę:  pozycja = koszt.
Zsumuj wszystkie koszty dla tych samych pozycji (np. mleko, chleb).

### PAB 02

1.Napisać funkcję odnajdującą maksimum z przekazanej listy obiektów (liczb, napisów) i zwracającą wartość maksymalną oraz pozycje (indeksy) listy na których ta wartość się znajduje. Użyć konstrukcji  eachWithIndex.

Poniższy programik, uzywający naszej funkcji maximum:
```
(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"
powinien wyprowadzić:

Maximum: 5
Indexes: [0, 2, 3, 5]
Maximum: c
Indexes: [1, 2, 3]
```

2.Napisać funkcję List getInts(), która prosi o podanie szeregu liczb całkowitych w dialogu wejściowym i zwraca listę wprowadzonych liczb (jako obiektów typu Integer). Nie dopuścić do wprowadzenia wadliwych danych (ponowienie dialogu do poprawki).

Pomoc (ew. pokazanie wadliwych danych w dialogu do poprawki):
```
public static String showInputDialog(Component parentComponent,
                                     Object message,
                                     Object initialSelectionValue)
```
Shows a question-message dialog requesting input from the user and parented to parentComponent. The input value will be initialized to initialSelectionValue. The dialog is displayed on top of the Component's frame, and is usually positioned below the Component.

Parameters:
parentComponent - the parent Component for the dialog (podamy null)
message - the Object to display (komunikat)
initialSelectionValue - the value used to initialize the input field (co się pokazuje w polu tekstowym dialogu)

3.Napisać funkcję List apply(List l, Closure c), która każdy element listy l transformuje za pomocą domknięcie c i zwraca listę transformowanych wartości. Przetestować dla różnych list i różnych domknięć


4.Uogólnić funkcję z zadania 4, tak by wprowadzane mogły być dowolne liczby i słowa (napisy rozdzielone białymi znakami), a ich poprawność weryfikowana za pomocą przekazanego funkcji domknięcia.
Niech funkcja nazywa sie getData.
Przykładowe wywołania:
```
getData(Integer) { it > 0 }           
println getData() { it.size() > 3 }
println getData()                        
println getData(BigDecimal)        
```

5.Zapewnić iterowanie na Iterable za pomocą metody eachTuple, umożliwiającej działanie podanego domknięcia na kolejnych  n-kach elemntow. Liczba n wynikać ma z liczby argumentów domknięcia.
W "płaskiej" definicji skryptowej można by jej uzywać np. tak
```
def list = (1..40)

eachTuple(list) { e1, e2, e3, e4 ->
  println "$e1 $e2 $e3 $e4"
}

def s = 'asia ma kota i psa'

def out = new StringBuffer()
eachTuple(s) { a,b ->
  out << b << a
}
println out
```
Wypisze:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
21 22 23 24
25 26 27 28
29 30 31 32
33 34 35 36
37 38 39 40
saaim  aokati p as

6.Przeanalizować i przedstawić zastosowania trampoline() i memoize().

### PAB 06

1.Dla poniższych definicji list:
```
def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]
```
za pomocą metody each(Closure)
a) wypisać wszystkie elementy,
b) stworzyć nowe listy list11 i list12 zawierające podwojone wartości list oryginalnych.


2.Firma software'owa prowadzi projekty w:
Groovy, Grails, Java, JEE
Do każdego projektu przypisani są programiści, co pokazuje poniższa mapa:
```
def pmap = [ Groovy: [ 'Asia', 'Jan' ],
                     Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
                     Java: [ 'Asia', 'Stefan', 'Mirek' ],
                     JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
                   ]
```
Wypisać:
a) ile osób pracuje w każdym z projektów
b) projekty, które mają więcej niż dwóch programistów
c)  w jakich projektach biorą udzial poszczególni programisci


3.Daty w tekście maja postać YYYY-MM-DD (rok- miesiac- dzien). Wypisać wszystkie poprawne daty.
czyli: po wyróznieniu wszytskicgh fragmentów, które mogą być datami sprawdizc ich poprawnośc.

4.a) Napisać wyrażenie regularne, za pomoca którego mozna odnaleźć w tekście dowolne liczby rzeczywiste.
b) zastosować je do przetwarzania tekstu zawierającego (posród innych) napisy w postaci liczba PLN, w taki sposób, aby zamienić te fragmenty na liczba EUR (po aktualnym kursie).

### PAB 07

1.Firma software'owa prowadzi projekty w:
Groovy, Grails, Java, JEE
Plik Projekty.txt zawiera informacje o składzie osobowym każdego z projektów w postaci:
nazwaprojektu<TAB>Nazwisko imie(1)<TAB>Nazwiskoimie(2)<TAB> itd
Utworzyc pliki:
ProjektyDuze.txt - zawierający spis projektów w którym pracuje > niż 3 osoby
Programisci.txt - zawierajacy spis programistow w postaci:
nazwisko imie<tab>proj1<tab>proj2<tab> itd.


2.Plik MenuPl.txt zawiera menu w postaci:
nazwa_dania cena

Ceny sa w PLN.
Na podstawie pliku wejsciowego stworzyc plik MenuEur.txt majacy te sama postac, ale z cenami w EUR.


3.Wylistować pełne nazwy wszystkich plików html z podanego katalogu i wzystkich jego podkatalogów w postaci:
```
1 nazwa
2 nazwa
```

Np.
```
1 D:\docs\api\allclasses-frame.html
2 D:\docs\api\allclasses-noframe.html
3 D:\docs\api\constant-values.html
4 D:\docs\api\deprecated-list.html
5 D:\docs\api\help-doc.html
7 D:\docs\api\index-files\index-10.html
8 D:\docs\api\index-files\index-11.html
9 D:\docs\api\index-files\index-12.html
10 D:\docs\api\index-files\index-13.html
```
