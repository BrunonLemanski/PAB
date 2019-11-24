package PAB01

import static javax.swing.JOptionPane.showInputDialog

map = [:]
1.upto(5) {
    inputDialog = showInputDialog("Podaj produkt i po spacji jego koszt")
    scan = new Scanner(inputDialog)
    product = scan.next()
    price = scan.nextDouble()
    map.put(product,price)
}
println(map)