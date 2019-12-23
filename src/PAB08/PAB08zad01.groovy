package PAB08

import static javax.swing.JOptionPane.*

println showInputDialog('Enter 5 numbers').tokenize()*.toInteger()*.multiply(2)
//println showInputDialog('Enter 5 numbers').tokenize()*.toInteger().collect() {it*2}
