package PAB09

import groovy.swing.SwingBuilder
import java.awt.*
import static javax.swing.WindowConstants.* //defaultCloseOperation

//text preferences
foregroundColor = Color.BLUE
backgroundColor = Color.RED
fontType = new Font('Dialog', Font.BOLD, 24)
//

swing = new SwingBuilder()

swing.edt {
    lookAndFeel('nimbus')
    frame(title: "Simple Editor - Text", pack: true, visible: true, defaultCloseOperation: EXIT_ON_CLOSE) {
        textArea(preferredSize: new Dimension(500, 500), foreground: foregroundColor,
                background: backgroundColor, font: fontType)
    }
}
