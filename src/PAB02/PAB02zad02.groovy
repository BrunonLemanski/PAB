package PAB02

import static javax.swing.JOptionPane.showInputDialog

List getInts() {
    list = []
    1.upto(5) {
        inputDialog = showInputDialog("Podaj liczbe calkowita")
        scan = new Scanner(inputDialog)
        list.add(scan.nextInt())
    }
    //List<Integer> output = list.collect { it -> Integer.parseInt(it) }
    return list
}
println getInts()